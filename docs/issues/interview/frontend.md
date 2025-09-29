# 高频前端面试题清单（含参考答案 + 手写题实现）

> 适合 3~5 年经验前端工程师复习

---

## 1. JavaScript 基础

### 1.1 var / let / const 区别
- **var**：函数作用域，存在变量提升，可重复声明。
- **let**：块级作用域，不提升，不可重复声明。
- **const**：块级作用域，声明后必须初始化，不能重新赋值（对象可修改属性）。

### 1.2 原型 & 原型链
- 每个函数都有 `prototype` 属性，指向原型对象。
- 每个对象都有 `__proto__`，指向构造函数的原型。
- 原型链是查找属性和方法的链式结构。
- 面试高频考察点：`instanceof` 判断、继承实现。

### 1.3 深拷贝和浅拷贝
- **浅拷贝**：只复制第一层对象，引用类型依然共享。
- **深拷贝**：
  - JSON：`JSON.parse(JSON.stringify(obj)`（无法处理函数/undefined/循环引用）
  - 递归实现：`structuredClone`（现代浏览器支持）

### 1.4 this 的指向
- 默认：指向全局对象（严格模式下为 `undefined`）
- 对象方法：指向当前对象
- 构造函数：指向新创建实例
- `call / apply / bind`：手动指定 `this`
- 箭头函数：不绑定 `this`，从外层作用域继承

### 1.5 事件循环 & 宏/微任务
- 宏任务：script、setTimeout、setInterval、setImmediate
- 微任务：Promise.then、MutationObserver、queueMicrotask
- 微任务优先级高于宏任务

---

## 2. 浏览器原理

### 2.1 渲染流程
1. 解析 HTML -> DOM
2. 解析 CSS -> CSSOM
3. 合并成 Render Tree
4. Layout（计算位置和大小）
5. Painting（绘制）
6. Compositing（合成显示）

优化重点：减少回流和重绘、合理使用 transform/opacity。

### 2.2 跨域解决方案
- JSONP
- CORS（设置 `Access-Control-Allow-Origin`）
- Nginx 反向代理
- postMessage、window.name、document.domain

### 2.3 浏览器缓存
- 强缓存：Expires、Cache-Control
- 协商缓存：Last-Modified + If-Modified-Since、ETag + If-None-Match

---

## 3. 性能优化
- 代码分割 + 懒加载（webpack dynamic import）
- Tree-shaking
- 图片优化（压缩、webp）
- 使用 CDN
- 长列表虚拟化（react-window / vue-virtual-scroll-list）
- 避免阻塞渲染的 JS / CSS

---

## 4. React / Vue 高频题

### React 高频
- 组件通信：props、context、redux、事件回调
- Hooks：useState、useEffect、useMemo、useCallback
- Diff 算法：同层比较、key 的重要性

### Vue 高频
- 响应式原理：Object.defineProperty（Vue2）、Proxy（Vue3）
- 生命周期钩子
- 组件通信：props、$emit、$attrs、provide/inject、Vuex/Pinia

---

## 5. 手写题实现

### 5.1 防抖函数
```js
function debounce(fn, delay) {
  let timer = null;
  return function(...args) {
    clearTimeout(timer);
    timer = setTimeout(() => fn.apply(this, args), delay);
  };
}

// 测试
const log = debounce(() => console.log("触发"), 300);
log();
log();
```

### 5.2 节流函数
```js
function throttle(fn, delay) {
  let last = 0;
  return function(...args) {
    const now = Date.now();
    if (now - last >= delay) {
      fn.apply(this, args);
      last = now;
    }
  };
}

// 测试
const log = throttle(() => console.log("触发"), 500);
setInterval(log, 100);
```

### 5.3 Promise.all
```js
function promiseAll(promises) {
  return new Promise((resolve, reject) => {
    let results = [];
    let count = 0;
    promises.forEach((p, i) => {
      Promise.resolve(p)
        .then(res => {
          results[i] = res;
          count++;
          if (count === promises.length) resolve(results);
        })
        .catch(reject);
    });
  });
}

// 测试
promiseAll([Promise.resolve(1), Promise.resolve(2)])
  .then(console.log); // [1,2]
```

### 5.4 手写 bind
```js
Function.prototype.myBind = function(context, ...args) {
  const fn = this;
  return function(...innerArgs) {
    return fn.apply(context, args.concat(innerArgs));
  };
};

function greet(greeting, name) {
  console.log(greeting, name);
}
const sayHi = greet.myBind(null, "Hi");
sayHi("Tom"); // Hi Tom
```

### 5.5 深拷贝
```js
function deepClone(obj, hash = new WeakMap()) {
  if (obj === null || typeof obj !== "object") return obj;
  if (hash.has(obj)) return hash.get(obj);
  const result = Array.isArray(obj) ? [] : {};
  hash.set(obj, result);
  for (let key in obj) {
    result[key] = deepClone(obj[key], hash);
  }
  return result;
}

// 测试
const a = { name: "Tom", info: { age: 20 } };
const b = deepClone(a);
b.info.age = 30;
console.log(a.info.age); // 20
```

### 5.6 发布订阅模式
```js
class EventBus {
  constructor() {
    this.events = {};
  }
  on(event, fn) {
    (this.events[event] || (this.events[event] = [])).push(fn);
  }
  off(event, fn) {
    this.events[event] = (this.events[event] || []).filter(f => f !== fn);
  }
  emit(event, ...args) {
    (this.events[event] || []).forEach(fn => fn(...args));
  }
}

// 测试
const bus = new EventBus();
function cb(msg) { console.log("收到:", msg); }
bus.on("test", cb);
bus.emit("test", "hello world");
bus.off("test", cb);
```

---

## 6. 算法高频题

### 6.1 数组去重
```js
const unique = arr => [...new Set(arr)];
console.log(unique([1, 2, 2, 3])); // [1,2,3]
```

### 6.2 两数之和
```js
function twoSum(nums, target) {
  const map = new Map();
  for (let i = 0; i < nums.length; i++) {
    if (map.has(target - nums[i])) return [map.get(target - nums[i]), i];
    map.set(nums[i], i);
  }
}
console.log(twoSum([2,7,11,15], 9)); // [0,1]
```

### 6.3 翻转二叉树
```js
function invertTree(root) {
  if (!root) return null;
  [root.left, root.right] = [invertTree(root.right), invertTree(root.left)];
  return root;
}
```

### 6.4 LRU 缓存
```js
class LRUCache {
  constructor(capacity) {
    this.capacity = capacity;
    this.map = new Map();
  }
  get(key) {
    if (!this.map.has(key)) return -1;
    const val = this.map.get(key);
    this.map.delete(key);
    this.map.set(key, val);
    return val;
  }
  put(key, value) {
    if (this.map.has(key)) this.map.delete(key);
    this.map.set(key, value);
    if (this.map.size > this.capacity) {
      this.map.delete(this.map.keys().next().value);
    }
  }
}

// 测试
const cache = new LRUCache(2);
cache.put(1,1);
cache.put(2,2);
console.log(cache.get(1)); // 1
cache.put(3,3);
console.log(cache.get(2)); // -1 (被淘汰)
```

### 6.5 大数相加
```js
function addBigNumber(a, b) {
  let i = a.length - 1, j = b.length - 1, carry = 0, res = "";
  while (i >= 0 || j >= 0 || carry) {
    const sum = (Number(a[i--] || 0) + Number(b[j--] || 0) + carry);
    res = (sum % 10) + res;
    carry = Math.floor(sum / 10);
  }
  return res;
}

console.log(addBigNumber("999", "1")); // "1000"
```

---

## 7. HR 面试常问
- 讲一个你最有成就感的项目
- 最近怎么学习前端新技术
- 遇到过最棘手的线上 Bug 怎么排查
- 未来 3 年职业规划
- 场景题：如何设计一个前端灰度发布系统？
- 编码实战：手写一个带缓存的HOC组件（考察闭包+性能）。
- 架构思维：SSR和CSR如何取舍？BFF层如何降低前端负担？
- 建议：把“会用”变成“懂为什么”，并能在业务场景中做出合理的技术
---

## 参考资料
- [MDN Web Docs](https://developer.mozilla.org/zh-CN/)
- [JavaScript 进阶指南](https://github.com/mqyqingfeng/Blog)
- [前端面试之道](https://github.com/InterviewMap/CS-Interview-Knowledge-Map)
