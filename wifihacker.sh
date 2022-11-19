#!/bin/bash

echo "RUN THIS SCRIPT AS ROOT"

ip addr
airmon-ng

read -p "enter interface name to switch to monitor mode: " iface0

airmon-ng check kill
airmon-ng start $iface0

read -p "enter interface name to start scanning: " iface1
read -p "Press enter to start scanning on specified interface" null

#now the fun starts

airodump-ng $iface1



#stopping everything

airmon-ng stop $iface1

#restart all networking things

systemctl restart networking.service
service networking restart
systemctl restart network-online.target

