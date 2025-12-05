#read -p 'Update documentation? (y/n) ' u
#if [ "$u" == "y" ]; then
javadoc -d ./doclet javafiles/*
#fi
node "doclet/start.js"