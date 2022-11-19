#create a program to change the extension of a certain file type recursively
#in a directory
#usage: extensionchanger.sh <directory> <old extension> <new extension>
#example: extensionchanger.sh /home/username/ .txt .doc



#check if the number of arguments is correct
if [ $# -ne 3 ]
then
    echo "usage: extensionchanger.sh <directory> <old extension> <new extension>"
    exit 1
fi

#check if the directory exists
if [ ! -d $1 ]
then
    echo "directory does not exist"
    exit 1
fi

#check if the old extension is valid
if [ ${2:0:1} != "." ]
then
    echo "old extension is not valid"
    exit 1
fi

#check if the new extension is valid
if [ ${3:0:1} != "." ]
then
    echo "new extension is not valid"
    exit 1
fi

#change the extension
find $1 -type f -name "*$2" -exec rename "s/$2$/$3/" {} \;

#check if the extension was changed
if [ $? -eq 0 ]
then
    echo "extension changed successfully"
else
    echo "extension could not be changed"
fi

#exit the program
exit 0