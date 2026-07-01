# Notion Workflows

This project uses the Notion connector for recurring project logs. When a user asks to save a troubleshooting log or daily scrum, use the databases below and follow the exact field names.

## Troubleshooting Log

Trigger phrases:
- "이거 트러블슈팅 로그로 남겨줘"
- "노션 트러블슈팅 로그로 남겨줘"
- "troubleshooting log로 남겨줘"

Page:
https://app.notion.com/p/poseybutter/38efc4e4631c8079ae80fae985823c21

Data source:
collection://38efc4e4-631c-8020-b80a-000b531dfcc6

Fields:
- 문제: title
- 상태: status, one of 시작 전, 진행 중, 완료
- 프로젝트: select, one of 쿠폰선빵, 공통
- 분류: multi_select, one or more of 프론트엔드, 백엔드, 데이터베이스, 인프라, 인증, 빌드, 테스트, 문서
- 중요도: select, one of 작업 막힘, 높음, 보통, 낮음
- 에러 메시지: text
- 상황: text
- 원인: text
- 시도한 방법: text
- 최종 해결: text
- 관련 파일: text
- 참고 링크: url
- 발생일: date, set with date:발생일:start and date:발생일:is_datetime
- 해결됨: checkbox, use __YES__ or __NO__

Defaults:
- 프로젝트: 쿠폰선빵
- 상태: 완료 when solved, 진행 중 when unresolved
- 해결됨: __YES__ only when a final fix is known

## Daily Scrum Log

Trigger phrases:
- "오늘 데일리 스크럼 남겨줘"
- "스크럼 로그로 남겨줘"
- "daily scrum으로 남겨줘"

Page:
https://app.notion.com/p/poseybutter/38efc4e4631c8018bdc3c9fdfa8d9901

Data source:
collection://35aa3b44-7eed-4510-860f-53b1e1bc54c7

Fields:
- 스크럼: title
- 날짜: date, set with date:날짜:start and date:날짜:is_datetime
- 작성자: person
- 상태: select, one of 작성 전, 작성 완료, 이슈 있음
- 프로젝트: select, one of 쿠폰선빵, 공통
- 스프린트: text
- 어제 한 일: text
- 오늘 할 일: text
- 막힌 점: text
- 도움 필요한 사람: person
- 관련 PR/이슈: url
- 이슈 여부: checkbox, use __YES__ or __NO__

Defaults:
- 프로젝트: 쿠폰선빵
- 상태: 이슈 있음 when 막힌 점 is present, otherwise 작성 완료
- 이슈 여부: __YES__ when 막힌 점 is present, otherwise __NO__
