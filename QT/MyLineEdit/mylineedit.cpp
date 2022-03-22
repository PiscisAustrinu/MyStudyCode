#include "mylineedit.h"

#include<QDebug>
#include<QEvent>

MyLineEdit::MyLineEdit(QWidget *parent) :
    QLineEdit(parent)
{
}
bool MyLineEdit::event(QEvent *event)
{
    if(event->type() == QEvent::KeyPress)
        qDebug()<<tr("MyLineEdit的event()函数");
    return QLineEdit::event(event);
}
