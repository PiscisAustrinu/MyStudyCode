#ifndef MYLINEEDIT_H
#define MYLINEEDIT_H
#include <QLineEdit>

class MyLineEdit : public QLineEdit
{
public:
    MyLineEdit();
    bool event(QEvent *event);
};

#endif // MYLINEEDIT_H
