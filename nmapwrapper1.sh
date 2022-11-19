echo "Please enter the IP address of the network you wish to scan"
read ipaddress
echo "Please enter the subnet mask of the network you wish to scan"
read subnetmask
echo "Please enter the name of the file you wish to save the results to"
read filename

nmap -sn $ipaddress/$subnetmask -oG $filename

echo "The scan has completed. The results are saved in $filename"
