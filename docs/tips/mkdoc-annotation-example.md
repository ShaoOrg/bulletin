# Material for MKDoc 的注解使用

### 使用在代码块中, 需要配置content.code.annotate

``` yaml
---
title: 我使用了注解,它是一个表格 # (1)!
---

# Page title
...
```

1.  | Flag                   | Status                          |
    | ----------- | ------------------------------------ |
    | `:material-check:`           | :material-check:    |
    | `:material-check-all:`       | :material-check-all:    |
    | `:material-close:`           | :material-close:    |	
    | `:x:`                        | :x:    |
    | `:heavy_multiplication_x:`   | :heavy_multiplication_x:    |
    | `:hourglass_flowing_sand:`   | :hourglass_flowing_sand:    |

### 使用在文本中
我使用了注解,它是一个表格 (1)
{ .annotate }

1.  | Flag                   | Status                          |
    | ----------- | ------------------------------------ |
    | `:material-check:`           | :material-check:    |
    | `:material-check-all:`       | :material-check-all:    |
    | `:material-close:`           | :material-close:    |	
    | `:x:`                        | :x:    |
    | `:heavy_multiplication_x:`   | :heavy_multiplication_x:    |
    | `:hourglass_flowing_sand:`   | :hourglass_flowing_sand:    |

### 使用在警告中
!!! note annotate "我使用了注解,它是一个表格 (1)"

    我使用了注解,它是一段文字 (2)

1.  | Flag                   | Status                          |
    | ----------- | ------------------------------------ |
    | `:material-check:`           | :material-check:    |
    | `:material-check-all:`       | :material-check-all:    |
    | `:material-close:`           | :material-close:    |	
    | `:x:`                        | :x:    |
    | `:heavy_multiplication_x:`   | :heavy_multiplication_x:    |
    | `:hourglass_flowing_sand:`   | :hourglass_flowing_sand:    |
2.  :woman_raising_hand: I'm an annotation as well!

### 使用在Tab页中
=== "页 1"

    我使用了注解,它是一段文字 (1)
    { .annotate }

    1.  :man_raising_hand: I'm an annotation!

=== "页 2"

    我使用了注解,它是一段文字 (1)
    { .annotate }

    1.  :woman_raising_hand: I'm an annotation as well!
