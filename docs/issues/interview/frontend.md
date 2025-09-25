# 高频前端面试题清单（含参考答案）

> 适合 3~5 年经验前端工程师复习

---

## 1. JavaScript 基础

### 1.1 var / let / const 区别
- **var**：函数作用域，存在变量提升，可重复声明。
- **let**：块级作用域，不提升，不可重复声明。
- **const**：块级作用域，声明后必须初始化，不能重新赋值（对象可修改属性）。

---

### 1.2 原型 & 原型链
- 每个函数都有 `prototype` 属性，指向原型对象。
- 每个对象都有 `__proto__`，指向构造函数的原型。
- 原型链是查找属性和方法的链式结构。
- 面试高频考察点：`instanceof` 判断、继承实现。

---

### 1.3 深拷贝和浅拷贝
- **浅拷贝**：只复制第一层对象，引用类型依然共享。
- **深拷贝**：
  - JSON：`JSON.parse(JSON.stringify(obj)`（无法处理函数/undefined/循环引用）
  - 递归实现：`structuredClone`（现代浏览器支持）

---

### 1.4 this 的指向
- 默认：指向全局对象（严格模式下为 `undefined`）
- 对象方法：指向当前对象
- 构造函数：指向新创建实例
- `call / apply / bind`：手动指定 `this`
- 箭头函数：不绑定 `this`，从外层作用域继承

---

### 1.5 事件循环 & 宏/微任务
- 宏任务：script、setTimeout、setInterval、setImmediate
- 微任务：Promise.then、MutationObserver、queueMicrotask
- 微任务优先级高于宏任务

---

## 2. 浏览器原理

### 2.1 浏览器渲染流程
1. 解析 HTML -> DOM
2. 解析 CSS -> CSSOM
3. 合并成 Render Tree
4. Layout（计算位置和大小）
5. Painting（绘制）
6. Compositing（合成显示）

优化重点：减少回流和重绘、合理使用 transform/opacity。

---

### 2.2 跨域解决方案
- JSONP
- CORS（设置 `Access-Control-Allow-Origin`）
- Nginx 反向代理
- postMessage、window.name、document.domain

---

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

### 4.1 React
- 组件通信：props、context、redux、事件回调
- Hooks：useState、useEffect、useMemo、useCallback 的区别和使用场景
- React Diff 算法：同层比较、key 的重要性

### 4.2 Vue
- 响应式原理：Object.defineProperty（Vue2）、Proxy（Vue3）
- 生命周期钩子
- 组件通信：props、$emit、$attrs、provide/inject、Vuex/Pinia

---

## 5. 工程化与构建

- webpack 热更新原理（HMR）
- Tree-shaking 原理（静态分析 ES Module）
- SourceMap 种类及作用
- CI/CD 基本流程

---

## 6. 网络与安全

- HTTP 缓存策略（强缓存、协商缓存）
- HTTPS 握手流程
- XSS、CSRF 防护
- 内容安全策略（CSP）

---

## 7. 手写题高频
- 防抖 / 节流函数
- 手写 Promise.all / Promise.race
- 手写 bind / call / apply
- 实现深拷贝
- 实现发布订阅模式

---

## 8. 算法高频题
- 数组去重
- 两数之和
- 翻转二叉树
- LRU 缓存
- 实现一个大数相加

---

## 9. HR 面试常问
- 讲一个你最有成就感的项目
- 最近怎么学习前端新技术
- 遇到过最棘手的线上 Bug 怎么排查
- 未来 3 年职业规划

---

## 参考
- [MDN Web Docs](https://developer.mozilla.org/zh-CN/)
- [JavaScript 进阶指南](https://github.com/mqyqingfeng/Blog)
- [前端面试之道](https://github.com/InterviewMap/CS-Interview-Knowledge-Map)
