def ContDonload(repo)
{
   git "https://github.com/suresh04bh/${repo}"
}

def ContBuild()
{
   sh "mvn package"
}

def ContDeploy(jobname,ip,appname)
{
   sh "scp /home/ubuntu/var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
