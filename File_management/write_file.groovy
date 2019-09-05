new File('r1soft.repo').withWriter('utf-8') {         
    writer  -> writer.writeLine '''[r1soft]
name=R1Soft Repository Server
baseurl=http://repo.r1soft.com/yum/stable/$basearch/
enabled=1
gpgcheck=0'''
}
