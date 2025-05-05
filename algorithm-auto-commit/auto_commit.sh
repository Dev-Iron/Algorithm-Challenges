#!/bin/bash

# 매개변수로 입력된 정보 받기
SITE=$1
TITLE=$2
LANG=$3

# 폴더 경로 설정
FOLDER_PATH="./%SITE/%LANG"

# 해당 폴더가 없으면 새로 생성
mkidr -p "$FOLDER_PATH"

# 파일 이름 생성
FILE_NAME="${TITLE// /_}.$LANG"


# 파일 경로 설정
TARGET_FILE="$FOLDER_PATH/$FILE_NAME"

# 코드가 클립보드에 있으면 붙어넣기
pbpaste > "$TARGET_FILE"

# GIT 상태 확인 후 추가
gir add "$TARGET_FILE"

# 커밋
git commit -m "Add Solution for $TITLE in $LANG"

# 원격 저장소에 푸시
git push
