# teamWork2
# 团队作业第二次——团队Github实战训练

| 这个作业属于哪个课程 | [2020春&#x7C;S班(福州大学)](https://edu.cnblogs.com/campus/fzu/2020SPRINGS/) |
| :------------------- | :----------------------------------------------------------- |
| 这个作业要求在哪里   | [团队作业第二次——团队Github实战训练](https://edu.cnblogs.com/campus/fzu/2020SPRINGS/homework/10404) |
| 团队名称             | Hail Hydra                                                   |
| 这个作业的目标       | 通过开发预约口罩应用的方式进行团队Github实战训练             |
| 作业正文             |[团队作业第二次——团队Github实战训练]()                                                         |
| 其他参考文献         | ...                                                          |
| Github网址         | [HailHydra2](https://github.com/HailHydra2/teamWork2.git) |


## 题目需求

​	在全国人民的共同努力下，新冠肺炎疫情得到逐步缓解，国内多地已经出现零确诊。然而当前国内形势严峻，多国疫情出现大爆发，国内出现了多例的输入病例，此时国人仍不可掉以轻心，外出需要注意个人防护，特别是要佩戴好口罩。虽然国内口罩等防护用品的产能和供应量在逐步增长，但目前还不能完全充分满足需求，仍然需要按需进行预约。假如，城市A需要开发一个向社会限量供应的口罩应用，现要外包给你们组完成这个任务。
​	简单来说，就是开发出一个预约口罩的应用，用户通过输入姓名、身份证号码、手机号码、预约口罩数量等信息进行登记，若登记成功则获得一个号码。用户通过输入号码查看是否中签，若中签则生成购买凭证。用户凭借购买凭证即可获得预约的口罩。



## 基础功能

##### 1. 预约功能：

+ 口罩预约定时开放
+ 开放预约后，市民可以进行登记；登记内容包括
  + 真实姓名
  + 身份证号
  + 手机号
  + 预约口罩数量
+ 预约登记
	+ 若手机号或者身份证号在本次摇号登记过了，预约失败
	+ 若手机号或者身份证号在此前三次预约中成功中签，预约失败
	+ 否则预约成功，给出不重复的预约编号
	+ 登记时单个用户最高可预约口罩数量，默认为3个
+ 预约定时关闭
+ 预约页面
	+ 提供两个按钮，作用分别是
	  + 开始新的预约
	  + 结束当前预约
	+ 提供设置口罩总量的方法

##### 2. 中签查询功能：

+ 用户输入自己的预约编号，显示是否中签
+ 若中签，则生成购买凭证，凭证信息包括：
	+ 姓名
	
	+ 身份证号
	
	+ 电话号
	
	+ 购买数量
	
	  
	

## 附加功能
+ 管理员发布预约摇号活动
+ 管理员登录
+ 设置预约的开放时间和截止时间
+ 设置预约时单个用户最高可预约数量
+ 设置口罩总数
+ 导出某次中签的名单



## 作业展示

#### 1. 组员职责分工

+ 前端：

	+ 刘成华：管理员登陆页面，管理员发布页面

	+ 袁锦辉：菜单栏，欢迎页面，用户预约页面

	+ 黄忠雄：表单美化，用户查询预约页面
+ 后端：
  + 黄子峻：设计数据库
  + 张嘉伟：Dao层，pojo层
  + 唐志豪：service层
  + 翁绍鸿：servlet层
+ 文档：韦琛
+ 郑逸豪生病住院

#### 2. github 的提交日志截图

#### 3. 各组员的commit次数
学号 | 次数
:-:|:--:
021700613| 
221600313| 
221701118| 
221701136| 
221701219| 
221701240（生病）| 
221701316| 
221701335| 
221701421| 

#### 4. 程序运行截图

#### 5. 程序运行环境

##### 		eclipse+tomcat+mysql

#### 6. GUI界面

##### 主页

![avatar](https://images.cnblogs.com/cnblogs_com/fdstnt/1670803/o_200315071310主页.png)
##### 预约口罩页面
![avatar](https://images.cnblogs.com/cnblogs_com/fdstnt/1670803/o_200315071328预约口罩页面.png)
##### 查询预约页面
![avatar](https://images.cnblogs.com/cnblogs_com/fdstnt/1670803/o_200315101818查询页面.png)
##### 管理员登录页面
![avatar](https://images.cnblogs.com/cnblogs_com/fdstnt/1670803/o_200315071342管理员登录页面.png)
##### 设置预约信息页面
![avatar](https://images.cnblogs.com/cnblogs_com/fdstnt/1670803/o_200315071353设置预约信息页面.png)


#### 7. 基础功能实现
	
	前端建立adminlogin类用来管理员登录界面、adminsetting类是管理员管理界面、book类是预约界面、index类是初始页面、query类是查询页面。
	后端建立AppointmentDao类进行预约的增删改查、Appointment类是预约的具体项目、acquireServlet类是获取信息接口、AppointServlet类是预约项目接口、DBUtil类是数据库工具类。
#### 

#### 8. 用户体验，操作的方便、快捷性

​	web应用功能明确。我们这个应用主要解决用户的口罩提供问题。用户只需一个链接即可进入网站预约口罩，不需要再下载一个软件。对于用户来说，预约口罩十分轻松。只需打开链接，点开预约口罩的页面，填入姓名、身份证号、手机号码等信息，再点开下拉菜单，选择要预约的口罩数目。若输入的信息无误，则预约成功。预约成功的用户想要查看具体情况，则点开查询预约页面，输入获得的号码，即可获知是否中签。若已中签，则显示购买凭证。用户凭借购买凭证即可获得所预约的口罩，操作非常方便。

#### 9. 遇到的困难及解决方法

+ 组员1

+ 组员2

+ …

#### 10. 评估每位组员的贡献比例

  学号 | 贡献度
:-:|:--:
021700613| 
221600313| 
221701118| 
221701136| 
221701219| 
221701240（生病）| 
221701316| 
221701335| 
221701421| 

#### 11. 各成员PSP表格

##### 黄忠雄

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 20 
Development|开发|150|140
Analysis|需求分析 (包括学习新技术)|40| 60 
Design Spec|生成设计文档|20| 15 
Design Review|设计复审|20| 30 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|100| 90 
Coding|具体编码|100| 120 
Code Review|代码复审|10| 15 
Test|测试（自我测试，修改代码，提交修改）|20| 15 
Reporting|报告|30| 25 
Test Repor|测试报告|5| 5 
Size Measurement|计算工作量|15| 10 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|30| 35 
|合计||610|625

##### 黄子峻

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 35 
Development|开发|500|540
Analysis|需求分析 (包括学习新技术)|50| 60 
Design Spec|生成设计文档|20| 15 
Design Review|设计复审|25| 30 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|100| 110 
Coding|具体编码|400| 420 
Code Review|代码复审|50| 60 
Test|测试（自我测试，修改代码，提交修改）|25| 30 
Reporting|报告|30| 25 
Test Repor|测试报告|5| 5 
Size Measurement|计算工作量|15| 10 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|30| 35 
|合计||1320|1420

##### 张嘉伟

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 35 
Development|开发|500|520
Analysis|需求分析 (包括学习新技术)|50| 60 
Design Spec|生成设计文档|20| 15 
Design Review|设计复审|25| 30 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|100| 110 
Coding|具体编码|410| 400 
Code Review|代码复审|50| 50 
Test|测试（自我测试，修改代码，提交修改）|25| 30 
Reporting|报告|30| 25 
Test Repor|测试报告|5| 5 
Size Measurement|计算工作量|15| 10 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|30| 35 
|合计||1350|1370

##### 唐志豪

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 35 
Development|开发|500|550
Analysis|需求分析 (包括学习新技术)|50| 60 
Design Spec|生成设计文档|20| 15 
Design Review|设计复审|25| 30 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|100| 110 
Coding|具体编码|420| 435 
Code Review|代码复审|50| 55 
Test|测试（自我测试，修改代码，提交修改）|25| 30 
Reporting|报告|30| 25 
Test Repor|测试报告|5| 5 
Size Measurement|计算工作量|15| 10 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|30| 25 
|合计||1340|1430

##### 韦琛

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 30 
Development|开发|10|15
Analysis|需求分析 (包括学习新技术)|40| 60 
Design Spec|生成设计文档|30| 35 
Design Review|设计复审|20| 30 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|20| 15 
Coding|具体编码|30| 20 
Code Review|代码复审|10| 15 
Test|测试（自我测试，修改代码，提交修改）|20| 30 
Reporting|报告|90| 120 
Test Repor|测试报告|15| 20 
Size Measurement|计算工作量|20| 20 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|30| 40 
|合计||405|495

##### 郑逸豪（生病中，在住院）

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划||
Estimate|估计这个任务需要多少时间||         
Development|开发||
Analysis|需求分析 (包括学习新技术)||       
Design Spec|生成设计文档||        
Design Review|设计复审||        
Coding Standard|代码规范 (为目前的开发制定合适的规范)||      
Design|具体设计||       
Coding|具体编码||       
Code Review|代码复审||      
Test|测试（自我测试，修改代码，提交修改）||       
Reporting|报告||      
Test Repor|测试报告||       
Size Measurement|计算工作量||        
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划||         
|合计|||

##### 刘成华

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 35 
Development|开发|140|125
Analysis|需求分析 (包括学习新技术)|40| 60 
Design Spec|生成设计文档|20| 15 
Design Review|设计复审|20| 15 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|100| 90 
Coding|具体编码|100| 120 
Code Review|代码复审|10| 10 
Test|测试（自我测试，修改代码，提交修改）|20| 15 
Reporting|报告|20| 20 
Test Repor|测试报告|5| 5 
Size Measurement|计算工作量|10| 10 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|30| 25 
|合计||585|590

##### 袁锦辉

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 25 
Development|开发|130|140
Analysis|需求分析 (包括学习新技术)|40| 60 
Design Spec|生成设计文档|20| 15 
Design Review|设计复审|20| 30 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|100| 90 
Coding|具体编码|115| 120 
Code Review|代码复审|10| 15 
Test|测试（自我测试，修改代码，提交修改）|20| 15 
Reporting|报告|30| 25 
Test Repor|测试报告|10| 5 
Size Measurement|计算工作量|15| 10 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|25| 35 
|合计||605|630

##### 翁绍鸿

PSP2.1 | Personal Software Process Stages | 预估耗时（分钟）|   实际耗时（分钟）
--|:--:|--:|--:
Planning|计划|20|20
Estimate|估计这个任务需要多少时间|30| 35 
Development|开发|490|550
Analysis|需求分析 (包括学习新技术)|50| 60 
Design Spec|生成设计文档|20| 15 
Design Review|设计复审|25| 30 
Coding Standard|代码规范 (为目前的开发制定合适的规范)|20| 25 
Design|具体设计|100| 110 
Coding|具体编码|410| 430 
Code Review|代码复审|50| 60 
Test|测试（自我测试，修改代码，提交修改）|25| 30 
Reporting|报告|30| 20 
Test Repor|测试报告|5| 5 
Size Measurement|计算工作量|15| 10 
Postmortem & Process Improvement Plan|事后总结, 并提出过程改进计划|30| 25 
|合计||1320|1425

#### 12. 反思

- 团队选题展示过程中，老师和同学提出了一些问题。有没有哪个问题你们想重新回答？

- 回答评分表中反馈的问题，如果与上一条重复可省略

- 在上次团队选题之后，你们组有什么新的思考和想法？
