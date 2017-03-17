#!/bin/bash
#program for create files
#history first release 20161124
read -p "input the filename which you want: " filename
count=`find -type f -name "$filename"|wc -l`
if [ "$count" -eq 0 ];then
	echo "pc server can create files now"
	for ((i=0;i<10;i++))
	do
		filenamepattern=${filename/+i/}$i
		touch "$filenamepattern"
	done
fi

#!/bin/bash
while :
do 
	read -p "please input the number: " var
	case $var in
	"1")
	echo "you are right"
	;;
	"2")
	echo "you are good"
	;;
	*)
	echo "very good"
	esac
done

#!/bin/bash
destination1="/tiger_dml/landing/riger"
destination2="/server/script/20161128"
source="/tiger_dml/landing/riger/server/script/20161125/"

cp ${source}ppp $destination1$destination2


change_hm_expiry_date.sh 99991231 20160726 20160831_99991231_EU_hierarchy-manager_20160906_103438.zip.gz
#!/bin/bash
sour_d=$1
target_d=$2
sour_f=$3
if [ $# -ne 3 ];then
echo "your argments are not right"
exit
fi
dirname=`dirname $3`
basename=`basename $3`
gzip -d $3

unsour_f=${basename%.gz}
files=''
files2=''
for var in `unzip $unsour_f |grep 'inflating'|awk -F':' '{print $2}' `
do
	echo "var is $var"
	new_name=`echo $var | sed s/${sour_d}/${target_d}/g`
	mv $var $new_name
	files="${new_name} ${files}"

done

temfile=`echo $unsour_f | sed s/${sour_d}/${target_d}/g`
temfile2=`echo $unsour_f | sed s/${sour_d}/123456/g`
zip $temfile $files > /dev/null
gzip $temfile
rm -r $files

rm -rf *.csv
gzip 20160831_99991231_EU_hierarchy-manager_20160906_103438.zip

#!/bin/bash
INPUT_FILE=$1
# run dos2unix on CSV if needed
if [ `grep -c '\r$' $INPUT_FILE` -gt 0 ]
then
    dos2unix $INPUT_FILE;
fi
LATEST_FILE=''
getLatestFile()
{
   path=$1
   filePattern=$2
   pattern="*${filePattern/\*\.gz/*-*_*.gz}"
   LATEST_FILE=`find "${path}" -name "${pattern}"|awk -F'/' '{print $NF}'`
   #pattern="/*${filePattern}"
   echo $pattern
   #LATEST_FILE=`grep "${pattern}" "${LAST_IMAGE}" | awk -F'/' '{print $NF}'`
   if [[ ${LATEST_FILE} == '' ]]
   then
                        echo "ERROR: Can't find ${pattern} in  ${path}" >> $LOG_FILE
   else
                        echo $LATEST_FILE >> $LOG_FILE_EXIST
                        #LATEST_FILE=''
   fi
}
# Loop through the lines
#/tiger_dml15/landing/murex/HBC,NAMRX_RAHBC*.csv_*.gz,Y,Y,N
while read LINE
do
    LANDING_PATH=`echo "$LINE" | cut -d, -f1`
    FILE_PATTERN=`echo "$LINE" | cut -d, -f2`
    getLatestFile ${LANDING_PATH} ${FILE_PATTERN}
	echo "LATEST_FILE is $LATEST_FILE"
    if [[ ${LATEST_FILE} != '' ]]
    then
        for FILE in ${LATEST_FILE}
        do
			echo "extract file ${LATEST_FILE}" >> $LOG_FILE
        done
    fi
done< $INPUT_FILE
exit 0


#!/bin/bash
#program  Get opts
function print_usage
{
        echo ""
	echo "*********************************"
        echo 'usage:'
   
	echo '  '$0' -s /data/BAU/prod_cube_backup/XXXX.tar.gz -t env-1 -d 20130101 -c 20130102,20130103 -a AP,EU'
        echo "******************************"
	echo ""
        return 0
}

# Get opts
declare -r OPSTRING="hs:"
declare SWITCH

while getopts "${OPSTRING}" SWITCH ; do
        case ${SWITCH} in
        h)
                print_usage
                exit 0
                ;;
        s)
                SOURCE_PATH_PARAM=${OPTARG}
                ;;
      
        *)
                print_usage
		exit 0
                ;;
        esac
done

echo ${SOURCE_PATH_PARAM}|grep -q "tar.gz$"
if [[ $? -eq 0 ]];then
	SOURCE_ARCHIVE_PATH="${SOURCE_PATH_PARAM}"
	if [[ (! -f ${SOURCE_ARCHIVE_PATH}) || (! -r ${SOURCE_ARCHIVE_PATH}) ]];then
		echo Archive file is not found or can\'t be read.Please check:${SOURCE_ARCHIVE_PATH}
		exit 255
	fi
else
	SOURCE_PATH=`env_mapping ${SOURCE_PATH_PARAM}`
	if [[ -z ${SOURCE_PATH} ]];then
		echo Please check the -s paramter !!!
		print_usage
		exit 255
	fi
fi


#!/bin/bash
#切割文件，然后添加列信息
#20161201 first

function output_usage
{
       echo "Usage: TREATS_HK_file_importer.sh ([GETDATEOPTION] [INPUTDATE])"
       echo "Mode 1, Get trading date from sys_pram: TREATS_HK_file_importer.sh  XXX.csv"
       return 0
}
if [ $# -le 0 ];then
    output_usage
    exit 255
fi

export TIMESTAMP=`date "+%Y%m%d_%H%M%S"`
export SYSDATE=`date "+%Y%m%d"`
export SYSTIME=`date "+%H:%M:%S"`
newfile_name="$TIMESTAMP".txt

file_sour=$1
if [[ -f $file_sour ]] && [[ -f $file_sour ]];then
     count=`head -1 "$file_sour"|sed 's/|/\n/g' |wc -l`
     echo "the count is $count"
     if [[ $count -eq 10 ]];then
         tail -n +2 $file_sour|awk -F'|' '{print $1"|"$2"|"$3"|"$4"|"$5"|"$6"|"$7"|"$8"|"$9"|"$10}'| sed 's/| |/||/g' >> $newfile_name
         echo " the count is $count"
     else
        tail -n +2 $file_sour|awk -F'|' '{print $1"|"$2"|"$3"|"$4"|"$5"|"$6"|"$7"|"$8"|"$9"|"$10"|"$11"|"$12"|"$13"|"$14}'| sed 's/| |/||/g' >> $newfile_name
        echo "you are bad"
     fi
else
    "the file is not exist or file format not match"
fi


#!/bin/bash
#输入1，2做选择 
read -p "If you want to show all path,please input 1, otherwise input 2: " num
while :
do
	if [[ $num -eq 1 ]];then
		export PS1='\u@\h:\w>'
		exit 0
	elif [[ $num -eq 2 ]];then 
		export PS1='\u@\h:\W>'
		exit 0
	else
		read -p "If you want to show all path,please input 1, otherwise input 2: " num
		exit 255
	fi
done 

#!/bin/bash
#2次解压文件，方法1
if [[ `find .|grep 'gz$'|wc -l` -gt 1 ]];then
gzip -d *.gz
fi
for var in `find .|cut -d "/" -f2|grep '^2016'`
do
	echo "var is $var"
	newname=`echo $var|cut -d "D" -f1 `
	mv $var $newname
done

for var2 in `find .|cut -d "/" -f2|grep '_R$'`
do	
	newname2=`echo $var2|sed 's/_R//g' `
	mv $var2 $newname2
done
if [[ `find .|grep 'gz$'|wc -l` -gt 1 ]];then
gzip -d *.gz
fi

#!/bin/bash
#2次解压文件，方法2
function file()
{
	if [[ `find .|grep 'gz$'|wc -l` -gt 1 ]];then
	gzip -d *.gz
	fi
}

file
for var in `find .|cut -d "/" -f2|grep '^2016'`
do
	echo "var is $var"
	filename=`echo "${var%%_RD*}"`
	mv $var $filename
done
file

#!/bin/bash
#2次解压文件，方法3
function file()
{
	if [[ `find .|grep 'gz$'|wc -l` -gt 1 ]];then
	gzip -d *.gz
	fi
}

file
for var in `find .|cut -d "/" -f2|grep '^2016'`
do
	echo "var is $var"
	filename=`echo "$var"|awk -F'_RD' '{print $1}'`
	mv $var $filename
done
file

#!/bin/bash
#program
#using component to check  wheather is correct or not
#history 20161208 first-release by:H
function file
{
	fartime
	total=`find .|grep '.gz$'|wc -l`
	if [[ $total -le 0 ]];then
		
		echo "there are not any '.gz files"
	else
		gzip -d  `find . |grep '.gz$'`
	fi
}
function cpfile
{
	fartime
	source_path=`pwd`
	cd ..
	cp `find . |grep '.gz$'|grep RD` $source_path
	cd $source_path
}
function fartime
{
	firsttime=`date +"%Y-%m-%d %H-%M-%S"`
	echo $firsttime
}
cpfile
fartime
file

for var in `find . | grep .gz | cut -d '/' -f2 `
do
	newfilename=`echo $var |awk -F'_RD' '{print $1}'`
	mv $var $newfilename
done
file

#!/bin/bash
#program : 1.Load the file into an array
#2.Loop the array elements by for
##history 20161212
function usage
{
	echo "*************************"
	echo "example: sh shell.sh file"
	echo "*************************"
	exit 1
}
if [[ $# -le 0 ]];then
	usage
fi

consolidated_csv=$1
consolidated_lines=( $(< $consolidated_csv ) )
consolidated_num=${#consolidated_lines[@]}
for ((i=0;i<$consolidated_num;i++))
do
  echo ${consolidated_lines[i]}
done
#!/bin/bash
#program : 1.Load the file into an array
#2.Loop the array elements by $array[*]
#3.get the length of array
#4.Added automatic creation of files  
##history 20161212
function usage
{
	echo "*************************"
	echo "example: sh shell.sh file"
	echo "*************************"
	exit 1
}
if [[ $# -le 0 ]];then
	usage
fi
num=$1
#create files or arraylist
nowtime=`date +"%Y%m%d_%H%M%S"`
filename=${nowtime}.txt
for var in `seq 1 $num`
do

    if [[ `expr $var % 5 ` -eq 0 ]];then
    {
        echo "aaz${var}b${var}" >> $filename
    }
    elif [[ `expr $var % 4 ` -eq 0 ]];then
    {
        echo "derf${var}68${var}" >> $filename
    }
	 elif [[ `expr $var % 3 ` -eq 0 ]];then
    {
        echo "tgbbnh${var}123${var}" >> $filename
    }
	 elif [[ `expr $var % 6 ` -eq 0 ]];then
    {
        echo "plmnko${var}123${var}" >> $filename
    }
    else
    {
        echo "t${var}y${var}" >> $filename
    }
    fi
done
consolidated_lines=( $(< $filename ) )
for var in ${consolidated_lines[*]}
do
	echo $var
	echo ${#var}
done

#!/bin/bash
#文件末尾添加两列信息，信息来自指定文件或者指定列
#history
#first release 20161207
#second 20161209 add: juge the internal parameter wheather input or not
#
function uage
{
	echo "**********************"
	echo "example: sh test.sh file"
	echo "**********************"
	exit 0
}
function intrnal
{
	if [[ ! -n $files ]];then
		echo "your input parameter is wrong"
		uage
	fi
}
function total
{
    cout=`cat $1 |head -1|awk -F'|' '{print NF}'`
    if [[ $cout -eq 0 ]];then
        echo "there is no any file"
        exit 255
    else
        cout=$(($cout+2))
    fi
	
}
function mkfiles
{
    TIMESTAMP=`date "+%Y%m%d_%H%M%S"`
    tmpfile=${TIMESTAMP}.txt
}

files=$1
intrnal $files
total $files
mkfiles
for ((i=0;i<$cout;i++))
do
	var=$i
done

while read line
do
	echo $line |awk -F'|' '{print $1"|"$2"|"$3"|"$4"|"$5"|"$6"|"$7"|"$8}'|sed "s/||/|$var|/g" >> $tmpfile

done < $files

#!/bin/bash
#program fix the filename and compress
#history 20161213
#$1 is filter condition, $2 is  string which need to be replaced
format=$1
disappear=$2
for var in `find .|grep $format|awk -F'/' '{print $2}'`
do
	newfile=`echo $var|sed "s/$disappear//g" `
	mv $var $newfile
	gzip $newfile
	mv ${newfile}.gz ${newfile}.gz_RD
done
#!/bin/bash
#program:
#1.zip & unzip the file to specifies the file path
#2.substring the String
#history 20161216
path=$1
for var in `find $path |grep .zip`
do
    p1=`dirname $var`
#   cd $p1

    unzip -o -d $p1 $var

    zip ${var%.csv*}.zip ${var%.zip*}
    rm -rf $var
    rm -rf ${var%.zip*}
done
#!/bin/bash
#program for getopts function
#2017-1-5
while getopts "a:b:c:d:e" opt
do
	case $opt in
	a)
	echo "the first is $OPTARG"
	;;
	b)
	echo "the second is $OPTARG"
	;;
	c)
	echo "the third is $OPTARG"
	;;
	\?)
	echo "the others is $OPTARG"
	;;
	esac
done
 
#!/bin/bash
#program restart server
#2017-1-9
function check_server
{
	 Envv=$1
	 num=$2
	 cd /tiger_dml${Envv}/app/central-scheduler/script
		for var in `ps -ef|grep tiger_dml${Envv} |grep -v grep |awk '{print $2}'`
		do
			if [[ $num == "Y" ]];then
				echo "the ild uid is $var"
				echo "kill -9 $var"
			elif [[ $num == "N" ]];then
				echo "the new uid is $var"
			else
				echo "something are wrong!"
			fi
		done
}
Env=$1
if [[ -z "$Env" ]];then
        echo "your parameter is null."
        echo "For example:sh $0 8"
        exit 1
fi
if [[ $? -eq 0 ]];then
	    check_server $Env Y
        read -p "If you want to start server,please input yes/no:" choice
        if [[ $choice == "yes" ]]||[[ $choice == "YES" ]]||[[ $choice == "Y" ]]||[[ $choice == "y" ]];then
                echo "that's ok ! the server will start, wait a monment."
        echo    "sh run-central-scheduler.sh"
        echo    "sh run-filePoller-scheduler.sh"
        fi
		check_server $Env N
fi

#!/bin/bash
#2017-1-11
#获取当前日期
foldername=`date +%Y%m%d`
files=$foldername.txt
foldercout=`find -type f|grep $foldername|wc -l`
echo "the total is $foldercout"
for ((i=0;i<20;i++))
do
	declare -i foldername=$foldername+1
	if [[ $foldercout -eq 0 ]];then
#创建文件，将字符串截取获取字段
	    echo ${foldername:0:4}-${foldername:4:2}-${foldername:6:2} >> $files
		echo "new foldername is $foldername"
	else
		echo "the folder have exist, so badly!"
	fi
done
#读取文件以数组形式，并判断日期格式
consolidated_lines=( $(< $files ))
for var in ${consolidated_lines[*]}
do
	if [[ ! -z $var ]];then
		cout=`echo $var|grep '[0-9][0-9][-/][0-9][0-9][-/][0-9][0-9]'`
		if [[ ! -z $cout ]];then
			echo "the year is $cout."
		fi
		
	else
		echo "wrong year."
	fi
done

#20170123 For awk :format begin
awk -F'_' '{print $1,$2}' newfile
#!/bin/bash
BEGIN{
printf "%3s %3s\n","Source","Site"
printf "-------------------------\n"
}
{
aa=echo $2|cut -d "2" -f1
printf "%3s %3s\n",$1,$2
}
END{
printf "%3s\n",aa
printf "-------------------------\n"
}

#20170123 For awk : loop in begin
#!/bin/bash
BEGIN{
printf "%3s","feed_id"
printf "-------------------------\n"
}
{
for(i=0;i<NF;i++)

printf "%8d\n",$i
}
END{
printf "%3s\n","good"good
printf "-------------------------\n"
} 


#!/bin/bash
function filename
{
	for var in `ls *RD`
	do
	site=`echo $var|cut -d '_' -f3|cut -d '-' -f2`
	echo $site
	mv $var /tiger_dml13/landing/treats/$site
	done
}
for var in `ls *zip`
do

	path=`echo $var |cut -d '_' -f1|sed 's/20161116//g'`
	if [[ $path -eq "CATREATSVS" ]];then
	{	echo "treats"	}	
	elif [[ $path -eq "USBLOOMBERGVS" ]];then
	{	echo "BLOOMBER"	}	
	elif [[ $path -eq  "USSMTHUBVS" ]];then
	{	echo "PLS"	}	
	else
		echo "hello"
	fi
done
