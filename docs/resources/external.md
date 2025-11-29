# 外部网络
---

## YouTobe

- [youtobe 口语 playlist 口语](https://www.youtube.com/watch?v=NfvkoQwEjjM&list=PLGsNz6F-e2fjdoz0RpDgmtw4BBBVK_6xK)
- [youtobe private playlists private playlists](https://youtobe.com/feed/playlists)
- [youtobe you private you](https://youtobe.com/feed/you)

## Testcontainers
|描述|地址|
|  ----  | ----  |
|customizing-images|[customizing-images](https://java.testcontainers.org/features/configuration/#customizing-images)|

## 面试网站

- [CS-Notes](https://github.shao.sh/CyC2018/CS-Notes)

## 常用工具网站

- [时间戳转换](https://tool.lu/timestamp/)
- [头条视频下载](https://snapany.com/zh)
- [目前国内可用Docker镜像源汇总（截至2025年8月）](https://www.coderjia.cn/archives/dba3f94c-a021-468a-8ac6-e840f85867ea)
- [7 types of jenkins build parameters with examples](https://codefresh.io/learn/jenkins/7-types-of-jenkins-build-parameters-with-examples/)
- [代码分析](https://deepwiki.com/CyC2018/CS-Notes)
- [音标输入](https://gltjk.com/program/ipainput/)
- [jwk生成](https://jwkset.com/generate)
- [Vault mTLS](https://www.hashicorp.com/en/resources/mutual-tls-mtls-for-vault-strategic-patterns-with-hands-on-steps)
- [Vault PKI API](https://developer.hashicorp.com/vault/api-docs/secret/pki)

## 一、固件／控制器层  
| 名称 | 仓库链接 | 简要说明 |
|------|----------|----------|
| `openssd/jasmine` | [https://github.com/openssd/jasmine](https://github.com/openssd/jasmine) :contentReference[oaicite:0]{index=0} | 来自 OpenSSD Project 的 SSD 固件平台源码，适用于研究教育用途。 |
| `CRZ-Technology/OpenSSD-OpenChannelSSD` | [https://github.com/CRZ-Technology/OpenSSD-OpenChannelSSD](https://github.com/CRZ-Technology/OpenSSD-OpenChannelSSD) :contentReference[oaicite:2]{index=2} | OpenChannel SSD / ZNS 源码。 |
| `Cosmos-OpenSSD/Cosmos-plus-OpenSSD` | [https://github.com/Cosmos-OpenSSD/Cosmos-plus-OpenSSD](https://github.com/Cosmos-OpenSSD/Cosmos-plus-OpenSSD) :contentReference[oaicite:3]{index=3} | Cosmos 平台的 OpenSSD 硬件 + 软件源码。 |
| `antmicro/openssd-nvme` | [https://github.com/antmicro/openssd-nvme](https://github.com/antmicro/openssd-nvme) :contentReference[oaicite:4]{index=4} | 与 OpenSSD 相关的 NVMe 主控/控制器逻辑源码。 |

## 二、性能／基准测试工具  
| 名称 | 仓库链接 | 简要说明 |
|------|----------|----------|
| `sassman/ssd-benchmark-rs` | [https://github.com/sassman/ssd-benchmark-rs](https://github.com/sassman/ssd-benchmark-rs) :contentReference[oaicite:5]{index=5} | 用 Rust 写的一个极简 SSD 基准测试工具，支持 Linux/macOS。 |
| `thomas-krenn/TKperf` | [https://github.com/thomas-krenn/TKperf](https://github.com/thomas-krenn/TKperf) :contentReference[oaicite:6]{index=6} | 面向 SSD/HDD/RAID 的性能测试脚本工具，基于 Python。 |
| `JonMagon/KDiskMark` | [https://github.com/JonMagon/KDiskMark](https://github.com/JonMagon/KDiskMark) :contentReference[oaicite:7]{index=7} | 一个 GUI 界面的 HDD/SSD 基准工具（Qt + C++）。 |

## 三、健康诊断／工具  
| 名称 | 仓库链接 | 简要说明 |
|------|----------|----------|
| `ashaduri/gsmartcontrol` | [https://github.com/ashaduri/gsmartcontrol](https://github.com/ashaduri/gsmartcontrol) :contentReference[oaicite:8]{index=8} | UI 工具，用于读取并监控 SSD/HDD 的 SMART 属性。 |
| `thesourcerer8/SSDdiag` | [https://github.com/thesourcerer8/SSDdiag](https://github.com/thesourcerer8/SSDdiag) :contentReference[oaicite:9]{index=9} | 专为 Samsung SSD EVO 系列问题诊断的工具。 |
| `CyberShadow/trimcheck` | [https://github.com/CyberShadow/trimcheck](https://github.com/CyberShadow/trimcheck) :contentReference[oaicite:10]{index=10} | Windows 下检测 SSD 是否支持 TRIM 的小工具。 |

## 四、存储设备测试／验证  
| 名称 | 仓库链接 | 简要说明 |
|------|----------|----------|
| `mbuesch/disktest` | [https://github.com/mbuesch/disktest](https://github.com/mbuesch/disktest) :contentReference[oaicite:11]{index=11} | 用于 SSD / NVMe / HDD / USB 等设备进行随机数据写入校验、完整性测试。 |
| `ncw/stressdisk` | [https://github.com/ncw/stressdisk](https://github.com/ncw/stressdisk) :contentReference[oaicite:12]{index=12} | 用于“烧盘”测试设备稳定性的 Go 程序，可用于 SSD 长期压力测试。 |

---

## 五、模拟／仿真平台  
| 名称 | 仓库链接 | 简要说明 |
|------|----------|----------|
| `DKU-StarLab/ConfZNS` | [https://github.com/DKU-StarLab/ConfZNS](https://github.com/DKU-StarLab/ConfZNS) :contentReference[oaicite:13]{index=13} | SSD 仿真器，支持 OpenChannel SSD / ZNS 模式，适合研究 FTL／设备架构。 |

---

# 📌 使用建议  
- 建议你们系统软件 team 浏览「固件／控制器」类的项目，了解 SSD 底层架构；  
- 「性能／基准测试」和「存储设备测试／验证」类项目适合你们测试部门集成、定制测试脚本；  
- 「健康诊断／工具」类可用于建立 SSD 健康状态监控体系；  
- 「仿真／模拟平台」对于研究新设备或可控环境下测试更有价值。  
- 可以fork这些仓库、改造或收纳到你们内部系统中，作为工具链或参考。

