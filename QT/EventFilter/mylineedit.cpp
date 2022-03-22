#include "mylineedit.h"
#include <QDebug>
#include <QEvent>
MyLineEdit::MyLineEdit()
{

}
bool MyLineEdit::event(QEvent *event)	// 事件
{

if(event->type() == QEvent::KeyPress)
qDebug() << tr("MyLineEdit 的 event()函数");
return QLineEdit::event(event);	//执行 QLineEdit 类event()函数的默认操作

}
