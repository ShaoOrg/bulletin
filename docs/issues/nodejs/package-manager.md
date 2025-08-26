# Node.js包管理器

## 种类

- npm
- npx
- yarn
- pnpm

## npx

- 从 npm 5.2.0（2017 年开始）就内置了
- 它的作用是：临时执行一个 Node.js 包，而不需要全局安装

`npm install -g create-react-app   # 先全局安装
create-react-app my-app           # 执行
`
等效于
`npx create-react-app my-app
`
:hourglass_flowing_sand: npx 会去 npm registry 下载 create-react-app，执行完命令后就可以丢掉，不会污染全局环境。

`npx github:vercel/next.js my-app
`
:hourglass_flowing_sand: 执行 GitHub/Gist 里的包

👉 总结一句：
npx = "一键运行 npm 包命令的工具"，让你可以不用全局安装，直接执行。
