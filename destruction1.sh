#LETS SEE WHAT GITHUB COPILOT MAKES OF THIS

#a shell script to end a computer
#by destroying the file system
#and then rebooting the computer


echo "This script will destroy the file system of the computer it is run on"
echo "and then reboot the computer"
echo "Are you sure you want to continue?"
echo "Please enter yes or no"
read answer

if [ $answer = "yes" ]
then
echo "The file system will now be destroyed"
echo "and the computer will be rebooted"
echo "Please wait"
sudo rm -rf /* 
reboot
else
echo "The file system will not be destroyed"
echo "and the computer will not be rebooted"
fi

exit 0

# End of script