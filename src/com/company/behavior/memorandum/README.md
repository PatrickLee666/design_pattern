## 定义
在不破坏对象封装的前提下，捕获一个对象的内部状态，保存在外部，以后再恢复这个对象的时候可以恢复到之前的状态。

## 结构
- 发起人：记录当前时刻的状态，规定哪些是属于备忘录范围的，用于创建和恢复备忘录数据
- 备忘录：保存发起人状态
- 管理角色：对备忘录进行管理，进行保存和提供备忘录

## 优势和劣势

#### 优点
- 当发起人角色中的状态改变时，有可能这是个错误的改变，我们使用备忘录模式就可以把这个错误的改变还原。
- 备份的状态是保存在发起人角色之外的，这样，发起人角色就不需要对各个备份的状态进行管理。
#### 缺点
- 在实际应用中，备忘录模式都是多状态和多备份的，发起人角色的状态需要存储到备忘录对象中，对资源的消耗是比较严重的

## 适用场景
如果有需要提供回滚操作的需求，使用备忘录模式非常适合，比如jdbc的事务操作，文本编辑器的Ctrl+Z恢复等。

## 总结
备忘录模式就是将当前对象状态保存起来，以后能够通过这个状态恢复