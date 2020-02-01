# lc-logging-demo

# Demo setup on RHEL 6.10 on ec2  

`alternatives --install /usr/bin/java java /opt/jdk1.8.0_241/bin/java 2`  

`sudo alternatives --install /usr/bin/jar jar /opt/jdk1.8.0_241/bin/jar 2`  

`sudo alternatives --install /usr/bin/jar javac /opt/jdk1.8.0_241/bin/javac 2`  

`sudo alternatives --set jar /opt/jdk1.8.0_241/bin/jar`  

`sudo alternatives --set javac /opt/jdk1.8.0_241/bin/javac`  

`cat /etc/*-release`  


`sudo yum install ?y https://s3.amazonaws.com/streaming-data-agent/aws-kinesis-agent-latest.amzn1.noarch.rpm`  

`/etc/aws-kinesis/agent.json`  
`/var/log/aws-kinesis-agent/aws-kinesis-agent.log`  

`sudo service aws-kinesis-agent stop`  
`sudo service aws-kinesis-agent start`  

`/tmp/logs/app.log`

# Maven:  

1. download Maven:  

    `$ cd /opt`  
    `$ sudo wget http://mirrors.ibiblio.org/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz`  
    `$ sudo tar xzf apache-maven-3.6.2-bin.tar.gz`  
    `$ sudo ln -s apache-maven-3.6.2 maven`  
    
### Setup Env variable  

    `$ sudo vi /etc/profile.d/maven.sh`  
    
add below lines to the above file  

    `export M2_HOME=/opt/maven    
    
    export PATH=${M2_HOME}/bin:${PATH}`  
    
### Load the file in curretn shell as below  

    `$ source /etc/profile.d/maven.sh`   

# Install jdk 1.8 for demo project  

`sudo yum install java-1.8.0-openjdk-devel`    

