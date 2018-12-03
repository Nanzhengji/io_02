# io_02
## 字符流的练习:Writer和Reader
### 字符流的类继承关系图
![字符流的类继承关系图](https://github.com/Nanzhengji/io_02/blob/master/字符流类结构图.jpg)
### 字符流与字节流操作过程的比较
 * 字节流
 ** 在程序中没有关闭字节流操作,文件中也依然存在输出的内容,证明字节流是直接操作文件本身的
 * 字符流
 ** 在程序中没有关闭字符流操作,文件中不存在输出的内容,证明字符流使用了缓冲区
![字符流操作的流程](https://github.com/Nanzhengji/io_02/blob/master/字节流与字符流的比较.jpg)
 
