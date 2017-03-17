#!/bin/bash
function Usage
{
	
	echo "********************************"
	echo "1)re-run -r "
	echo "2)re-run -f "
	echo "3)when feeds landing counts "
	echo "4)when feeds outgoing counts"
	echo "5)feed loaded fails logs check "
	echo "6)file-sender fails logs check"
	echo "7)Copy files from out to land"
	read -p "Input your choice: " Choice
}
function roll_job
{
	local filter=$1
	#Must be initialized, let env and date null.Or they always get cache data.
	roll_date=''
	roll_env=''
	echo "filter is $filter"
	echo "*******************************************************************"
	if [[ $filter -eq 1 ]];then
		echo "Cob_date and env two parameters are required,when roll-job -r "
		until [ "$roll_date" != "" ]&&[ "$roll_env" != "" ]
		do
			read -p "Input the cob_date: " roll_date
			read -p "Input the env num: " roll_env
		done
	else
		echo "Env rarameter is required,when roll-job -f "
		until [ "$roll_env" != "" ]
		do
			read -p "Input the env num: " roll_env
		done
	fi
	echo "*******************************************************************"			
}
function roll_job_judge
{
	local dml_env=$1
	local dml_cob=$2
	#pay attention loading data from file  "<"
	feed_array=($(<feed_r))  
	if  [[ $dml_cob != '' ]];then
		for groupid in ${feed_array[*]}
		do
		echo "$dml_env , $dml_cob  , $groupid"
		#	 nohup sh /tiger_dml${dml_env}/app/central-scheduler/script/rerun.sh -r $dml_cob $groupid ALL &
		done
		exit 0
	elif [[ $dml_env != '' ]];then
		for groupid in ${feed_array[*]}
		do
		echo "$dml_env , $dml_cob  , $groupid"
		#	 nohup sh /tiger_dml${dml_env}/app/central-scheduler/script/rerun.sh -f  $groupid  &
		done
		exit 0
	else
		"Your Parameters are null, input the Valid parameters"
		Usage
	fi
	
}
function Counts
{
	Count_filter=$1
	if [[ $Count_filter -eq 3 ]];then
			feeds_path=landing
	elif [[ $Count_filter -eq 4 ]];then
			feeds_path=outgoing
	else
		Usage
	fi
	#Initializes null data
	count_env=''
	count_sys=''
	count_site=''
	count_filename=''
	
	until [ "$count_env" != "" ]&&[ "$count_sys" != "" ]&&[ "$count_filename" != "" ]
	do
		read -p "For dml feeds count monitor, input env :" count_env
		read -p "For dml feeds count monitor, input source_system :" count_sys
		read -p "For dml feeds count monitor, input count_filename :" count_filename
	done
	read -p "For dml feeds count monitor, input site :" count_site
	for ((i=0;i<100;i++))
	do
		if [[ "$count_site" != "" ]];then
			count=`find  /tiger_dml${count_env}/${feeds_path}/${count_sys}/${count_site}  -type f|grep ${count_filename}|wc -l`
			
		else
			count=`find  /tiger_dml${count_env}/${feeds_path}/${count_sys}  -type f|grep ${count_filename} |wc -l`
		fi
		echo "the feeds count is $count"
		sleep 10
	done
}
function Cpfiles
{
	echo "Copy files from outgoing to landing path"
	read -p "For dml feeds count monitor, input file_env :" file_env
	read -p "For dml feeds count monitor, input file_sys :" file_sys
	read -p "For dml feeds count monitor, input file_site :" file_site
	read -p "For dml feeds count monitor, input file_filename :" file_filename
	
	cp `find /tiger_dml${file_env}/outgoing/${file_sys}/${file_site} -type f -name  "*file_filename*"` /tiger_dml${file_env}/landing/${file_sys}/${file_site}
	
}
while : 
do
	Usage
	case $Choice in 
	"1")
		roll_job $Choice
		echo "$roll_env $roll_date"
		roll_job_judge $roll_env $roll_date
	;;
	"2")
		roll_job $Choice
		echo "$roll_env $roll_date"
		roll_job_judge $roll_env 
	;;
	"3")
		Counts $Choice
	;;
	"4")
		Counts $Choice
	;;
	"7")
		Cpfiles $Choice
	;;
	*)
	echo "your argxs not correct"
	exit 1
	;;
	esac
done  




#!/bin/bash
function check_cobdate_format
{
	echo $1|grep -q "^[0-9]\{8\}$"
	return $?
}
CLONE_DATELIST_PARAM=$1
SOURCE_DATE=$2

if [[ -z "${CLONE_DATELIST_PARAM}" ]];then
	CLONE_DATELIST_STRING=${SOURCE_DATE}
	CLONE_DATELIST_ARRAY=${SOURCE_DATE}
else
	CLONE_DATELIST_TEMP=($(echo ${CLONE_DATELIST_PARAM}|tr ',' ' '|tr -s ' '))
	echo "CLONE_DATELIST_TEMP is $CLONE_DATELIST_TEMP"
	for((i=0;i<${#CLONE_DATELIST_TEMP[@]};i++))
	do
		check_cobdate_format ${CLONE_DATELIST_TEMP[$i]}
		if [[ $? -eq 0 ]];then
			if [[ -z "${CLONE_DATELIST_STRING}" ]];then
				CLONE_DATELIST_STRING="${CLONE_DATELIST_TEMP[$i]}"
			else
				CLONE_DATELIST_STRING="${CLONE_DATELIST_STRING} ${CLONE_DATELIST_TEMP[$i]}"
			fi
		fi
	done
	if [[ -z "${CLONE_DATELIST_STRING}" ]];then
		echo Please check the -c paramter !!!
		print_usage
		exit 255
	else
		CLONE_DATELIST_ARRAY=(${CLONE_DATELIST_STRING})
	fi
fi

CLONE_LENGTH=${#CLONE_DATELIST_ARRAY[@]}
for((i=0;i<${CLONE_LENGTH};i++))
do
	TARGET_DATE=${CLONE_DATELIST_ARRAY[$i]}
	if [[ "${RANGE}" == "all" || "${RANGE}" == "static" ]];then
		echo "Clean up "}
	fi
done

echo "Clean up target file and working directory."






















export PS1='\u@\h:\W>'

ssh dmlusr@gmdas098was01s.hk.hsbc
ssh dmlusr@gbl05798.systems.uk.hsbc
/tiger_dml/landing/riger/server/script/201701

ssh vaausr@gbl08566.systems.uk.hsbc  VA1$best!
