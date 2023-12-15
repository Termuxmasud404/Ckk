#!/bin/bash

echo "Creating directory for termux-banner-java"
mkdir ~/termux-banner-java

echo "Downloading termux-banner-java tool"
wget -O ~/termux-banner-java/termux-banner-java.zip https://github.com/0x172F/Termux-Banner-Java/archive/refs/heads/main.zip

echo "Extracting termux-banner-java tool"
unzip ~/termux-banner-java/termux-banner-java.zip -d ~/termux-banner-java

echo "Creating shortcut for termux-banner-java tool"
echo "alias termux-banner-java='java -jar ~/termux-banner-java/Termux-Banner-Java-main/target/Termux-Banner-Java-0.1.jar'" >> ~/.bashrc
source ~/.bashrc

echo "termux-banner-java tool successfully installed and set up. You can use it by running the 'termux-banner-java' command."
