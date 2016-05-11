observer(观察者模式)
========
	观察者模式，又称为发布(publish)-订阅(subscribe)模式
	发布者和订阅者之间的关系：一个发布者可以拥有多个订阅者，同时一个订阅者也可以订阅多个发布者
	这个模式的本质用4个字形容就是:触发联动
注意
-------------------
	单向依赖:只有订阅者依赖发布者，而发布者是不会依赖订阅者的，主动权永远掌握在发布者的手中，而订阅者永远都是被动的，等待通知
	命名建议:发布者后面跟上Subject,订阅者后面跟上Observer,订阅者的更新方法命名为update
	触发通知的时机:一般是完成了状态维护后触发,因为通知会传递数据，不能先通知再改数据，这很容易会出问题，会导致发布者和订阅者的状态不一致
	通知的顺序:因为通知所有订阅者的时候，顺序是不确定的，所以订阅者实现的功能不能依赖于通知的顺序，多个订阅者的顺序应该是平行的，不能依赖于顺序
推和拉
-------------------
	推模型:发布者在通知订阅者的时候，只传递少量信息
	拉模型:发布者向订阅者推送详细信息，推送的信息通常是自身对象的全部或部分数据
		如果订阅者需要更多更具体的信息，由订阅者主动到发布者对象中获取，相当于是订阅者从发布者对象中拉数据
		一般这种模型的视线中，会把发布者对象自身通过update方法传递给订阅者
推和拉的比较
-------------------
	推模型:是假定发布者知道订阅者需要的数据
		会使订阅者对象难以复用，因为是按需求定制的，传递的数据是根据需求来的
	拉模型:是发布者不知道订阅者需要什么数据，因此把自身传递给订阅者，让订阅者自己获取需要的数据
		update方法的参数是发布者对象的本身，基本上可以适用各种需求
优缺点		
-------------------
	优点:
		1.观察者模式实现了观察者和目标之间的抽象耦合
		2.观察者模式实现了动态联动
		3.观察者模式支持广播通信
	缺点:
		1.可能会引起无谓的操作,会对所有订阅者进行广播通信，无论订阅者需不需要
使用时机(建议)
-------------------
	1.当一个抽象模型有两个方面，其中一个方面的操作依赖于另一个方面的状态变化
	2.如果在更改一个对象的时候，需要同时连带改变其他对象，而且不知道有多少个对象需要被连带改变
	3.当一个对象必须通知其他的对象，同时又希望这个对象和其他被通知的对象是松散耦合的。