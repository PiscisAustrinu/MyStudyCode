#include <QtCore/QCoreApplication>
#include <QDir>
#include <QList>
#include <QFileInfoList>
#include <QDebug>
#include <QTextCodec>
int main(int argc, char *argv[])

{

    QCoreApplication a(argc, argv);

    QTextCodec *codec = QTextCodec::codecForName("GB2312");
    QTextCodec::setCodecForLocale(codec);
    QTextCodec::setCodecForLocale(codec);
    QTextCodec::setCodecForLocale(codec);
    QDir d("C:/Mycode");
    d.setFilter(QDir::Files | QDir::Hidden | QDir::NoSymLinks | QDir::AllDirs);//列出文件,列出隐藏文件（在Unix 下就是以.开始的为文件）,不列出符号链接（不支持符号连接的操作系统会忽略）
    d.setSorting(QDir::Size | QDir::Reversed);//按文件大小排序，相反的排序顺序const QFileInfoList list = d.entryInfoList();//返回这个目录中所有目录和文件的


    const QList<QString> list = d.entryList(); //返回这个目录中所有目录和文件的名称的列表
    QList<QString>::const_iterator iterator = list.begin();

    while(iterator != list.end()){

    qDebug() << (*iterator);

    iterator++;

    }
    return a.exec();
}
