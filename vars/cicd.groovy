def ContDonload(repo)
{
   git "https://github.com/suresh04bh/${repo}"
}

def ContBuild()
{
   sh "mvn package"
}



