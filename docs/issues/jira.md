# Jira

## Rest API

### [v2](https://developer.atlassian.com/cloud/jira/platform/rest/v2/intro/#version)

### [Get comments](https://developer.atlassian.com/cloud/jira/platform/rest/v2/api-group-issue-comments/#api-rest-api-2-issue-issueidorkey-comment-get)

```bash
curl -s -L -X GET \
  --url 'https://de.vicp.net:6586/rest/api/2/issue/KS-184/comment' \
  -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" \
  --header 'Accept: application/json'
```

### [Get all projects](https://developer.atlassian.com/cloud/jira/platform/rest/v2/api-group-projects/#api-group-projects)

```bash
curl -s -L -X GET \
  --url 'https://de.vicp.net:6586/rest/api/latest/project' \
  -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" \
  -H 'Accept: application/json'
```

### issue type

```bash
curl -s -L -X GET -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" --url 'https://de.vicp.net:6586/rest/api/latest/issuetype'
```

### webhook

```bash
curl -s -L -X GET -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" --url 'https://de.vicp.net:6586/rest/api/2/webhook/failed'
```
### 列出所有issuetype

```bash
curl -s -L -X GET -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" --url 'https://de.vicp.net:6586/rest/api/2/issuetype'
```
Response
```
[{
	"self": "http://de.vicp.net:6586/rest/api/2/issuetype/10002",
	"id": "10002",
	"description": "需要完成的任务。",
	"iconUrl": "http://de.vicp.net:6586/secure/viewavatar?size=xsmall&avatarId=10318&avatarType=issuetype",
	"name": "任务",
	"subtask": false,
	"avatarId": 10318
},
{
	"self": "http://de.vicp.net:6586/rest/api/2/issuetype/10003",
	"id": "10003",
	"description": "事务的子任务。",
	"iconUrl": "http://de.vicp.net:6586/secure/viewavatar?size=xsmall&avatarId=10316&avatarType=issuetype",
	"name": "子任务",
	"subtask": true,
	"avatarId": 10316
},
{
	"self": "http://de.vicp.net:6586/rest/api/2/issuetype/10001",
	"id": "10001",
	"description": "",
	"iconUrl": "http://de.vicp.net:6586/images/icons/issuetypes/story.svg",
	"name": "故事",
	"subtask": false
},
{
	"self": "http://de.vicp.net:6586/rest/api/2/issuetype/10004",
	"id": "10004",
	"description": "",
	"iconUrl": "http://de.vicp.net:6586/secure/viewavatar?size=xsmall&avatarId=10303&avatarType=issuetype",
	"name": "故障",
	"subtask": false,
	"avatarId": 10303
},
{
	"self": "http://de.vicp.net:6586/rest/api/2/issuetype/10000",
	"id": "10000",
	"description": "由 Jira Software 创建——请勿编辑或删除。适用于大型用户故事的事务类型， 需加以细分。",
	"iconUrl": "http://de.vicp.net:6586/images/icons/issuetypes/epic.svg",
	"name": "Epic",
	"subtask": false
}]
```

- 列出定制化字段
Response
```
[{
	"id": "issuetype",
	"name": "问题类型",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["issuetype",
	"type"],
	"schema": {
		"type": "issuetype",
		"system": "issuetype"
	}
},
{
	"id": "timespent",
	"name": "耗费时间",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["timespent"],
	"schema": {
		"type": "number",
		"system": "timespent"
	}
},
{
	"id": "project",
	"name": "项目",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["project"],
	"schema": {
		"type": "project",
		"system": "project"
	}
},
{
	"id": "fixVersions",
	"name": "修复的版本",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["fixVersion"],
	"schema": {
		"type": "array",
		"items": "version",
		"system": "fixVersions"
	}
},
{
	"id": "aggregatetimespent",
	"name": "Σ 耗费时间",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": [],
	"schema": {
		"type": "number",
		"system": "aggregatetimespent"
	}
},
{
	"id": "resolution",
	"name": "解决结果",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["resolution"],
	"schema": {
		"type": "resolution",
		"system": "resolution"
	}
},
{
	"id": "customfield_10104",
	"name": "Epic Color",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10104]",
	"Epic Color"],
	"schema": {
		"type": "string",
		"custom": "com.pyxis.greenhopper.jira:gh-epic-color",
		"customId": 10104
	}
},
{
	"id": "customfield_10105",
	"name": "Rank",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10105]",
	"Rank"],
	"schema": {
		"type": "any",
		"custom": "com.pyxis.greenhopper.jira:gh-lexo-rank",
		"customId": 10105
	}
},
{
	"id": "customfield_10106",
	"name": "Story Points",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10106]",
	"Story Points"],
	"schema": {
		"type": "number",
		"custom": "com.atlassian.jira.plugin.system.customfieldtypes:float",
		"customId": 10106
	}
},
{
	"id": "customfield_10107",
	"name": "Flagged",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10107]",
	"Flagged"],
	"schema": {
		"type": "array",
		"items": "option",
		"custom": "com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes",
		"customId": 10107
	}
},
{
	"id": "customfield_10108",
	"name": "Resolution Notes",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10108]",
	"Resolution Notes"],
	"schema": {
		"type": "string",
		"custom": "com.atlassian.jira.plugin.system.customfieldtypes:textarea",
		"customId": 10108
	}
},
{
	"id": "customfield_10109",
	"name": "Verification Notes",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10109]",
	"Verification Notes"],
	"schema": {
		"type": "string",
		"custom": "com.atlassian.jira.plugin.system.customfieldtypes:textarea",
		"customId": 10109
	}
},
{
	"id": "resolutiondate",
	"name": "已解决",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["resolutiondate",
	"resolved"],
	"schema": {
		"type": "datetime",
		"system": "resolutiondate"
	}
},
{
	"id": "workratio",
	"name": "工作量比率",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["workratio"],
	"schema": {
		"type": "number",
		"system": "workratio"
	}
},
{
	"id": "lastViewed",
	"name": "最近查看的",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["lastViewed"],
	"schema": {
		"type": "datetime",
		"system": "lastViewed"
	}
},
{
	"id": "watches",
	"name": "管理关注列表",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["watchers"],
	"schema": {
		"type": "watches",
		"system": "watches"
	}
},
{
	"id": "thumbnail",
	"name": "图像",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": []
},
{
	"id": "created",
	"name": "创建日期",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["created",
	"createdDate"],
	"schema": {
		"type": "datetime",
		"system": "created"
	}
},
{
	"id": "priority",
	"name": "优先级",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["priority"],
	"schema": {
		"type": "priority",
		"system": "priority"
	}
},
{
	"id": "customfield_10100",
	"name": "Sprint",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10100]",
	"Sprint"],
	"schema": {
		"type": "array",
		"items": "string",
		"custom": "com.pyxis.greenhopper.jira:gh-sprint",
		"customId": 10100
	}
},
{
	"id": "customfield_10101",
	"name": "Epic Link",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10101]",
	"Epic Link"],
	"schema": {
		"type": "any",
		"custom": "com.pyxis.greenhopper.jira:gh-epic-link",
		"customId": 10101
	}
},
{
	"id": "customfield_10102",
	"name": "Epic Status",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10102]",
	"Epic Status"],
	"schema": {
		"type": "option",
		"custom": "com.pyxis.greenhopper.jira:gh-epic-status",
		"customId": 10102
	}
},
{
	"id": "labels",
	"name": "标签",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["labels"],
	"schema": {
		"type": "array",
		"items": "string",
		"system": "labels"
	}
},
{
	"id": "customfield_10103",
	"name": "Epic Name",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10103]",
	"Epic Name"],
	"schema": {
		"type": "string",
		"custom": "com.pyxis.greenhopper.jira:gh-epic-label",
		"customId": 10103
	}
},
{
	"id": "timeestimate",
	"name": "剩余的估算",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["remainingEstimate",
	"timeestimate"],
	"schema": {
		"type": "number",
		"system": "timeestimate"
	}
},
{
	"id": "aggregatetimeoriginalestimate",
	"name": "Σ 原预估时间",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": [],
	"schema": {
		"type": "number",
		"system": "aggregatetimeoriginalestimate"
	}
},
{
	"id": "versions",
	"name": "影响版本",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["affectedVersion"],
	"schema": {
		"type": "array",
		"items": "version",
		"system": "versions"
	}
},
{
	"id": "issuelinks",
	"name": "链接的问题",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": [],
	"schema": {
		"type": "array",
		"items": "issuelinks",
		"system": "issuelinks"
	}
},
{
	"id": "assignee",
	"name": "经办人",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["assignee"],
	"schema": {
		"type": "user",
		"system": "assignee"
	}
},
{
	"id": "updated",
	"name": "已更新",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["updated",
	"updatedDate"],
	"schema": {
		"type": "datetime",
		"system": "updated"
	}
},
{
	"id": "status",
	"name": "状态",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["status"],
	"schema": {
		"type": "status",
		"system": "status"
	}
},
{
	"id": "components",
	"name": "模块",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["component"],
	"schema": {
		"type": "array",
		"items": "component",
		"system": "components"
	}
},
{
	"id": "issuekey",
	"name": "关键字",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["id",
	"issue",
	"issuekey",
	"key"]
},
{
	"id": "timeoriginalestimate",
	"name": "初始预估",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["originalEstimate",
	"timeoriginalestimate"],
	"schema": {
		"type": "number",
		"system": "timeoriginalestimate"
	}
},
{
	"id": "description",
	"name": "描述",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["description"],
	"schema": {
		"type": "string",
		"system": "description"
	}
},
{
	"id": "timetracking",
	"name": "时间跟踪",
	"custom": false,
	"orderable": true,
	"navigable": false,
	"searchable": true,
	"clauseNames": [],
	"schema": {
		"type": "timetracking",
		"system": "timetracking"
	}
},
{
	"id": "customfield_10203",
	"name": "Original story points",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10203]",
	"Original story points"],
	"schema": {
		"type": "number",
		"custom": "com.atlassian.jpo:jpo-custom-field-original-story-points",
		"customId": 10203
	}
},
{
	"id": "customfield_10204",
	"name": "Team",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10204]",
	"Team"],
	"schema": {
		"type": "any",
		"custom": "com.atlassian.teams:rm-teams-custom-field-team",
		"customId": 10204
	}
},
{
	"id": "security",
	"name": "安全级别",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["level"],
	"schema": {
		"type": "securitylevel",
		"system": "security"
	}
},
{
	"id": "attachment",
	"name": "附件",
	"custom": false,
	"orderable": true,
	"navigable": false,
	"searchable": true,
	"clauseNames": ["attachments"],
	"schema": {
		"type": "array",
		"items": "attachment",
		"system": "attachment"
	}
},
{
	"id": "aggregatetimeestimate",
	"name": "Σ 预估剩余时间",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": [],
	"schema": {
		"type": "number",
		"system": "aggregatetimeestimate"
	}
},
{
	"id": "summary",
	"name": "概要",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["summary"],
	"schema": {
		"type": "string",
		"system": "summary"
	}
},
{
	"id": "creator",
	"name": "创建者",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["creator"],
	"schema": {
		"type": "user",
		"system": "creator"
	}
},
{
	"id": "subtasks",
	"name": "子任务",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["subtasks"],
	"schema": {
		"type": "array",
		"items": "issuelinks",
		"system": "subtasks"
	}
},
{
	"id": "reporter",
	"name": "报告人",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["reporter"],
	"schema": {
		"type": "user",
		"system": "reporter"
	}
},
{
	"id": "aggregateprogress",
	"name": "Σ 进度",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": [],
	"schema": {
		"type": "progress",
		"system": "aggregateprogress"
	}
},
{
	"id": "customfield_10000",
	"name": "Development",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10000]",
	"Development"],
	"schema": {
		"type": "any",
		"custom": "com.atlassian.jira.plugins.jira-development-integration-plugin:devsummary",
		"customId": 10000
	}
},
{
	"id": "customfield_10200",
	"name": "Parent Link",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10200]",
	"Parent Link"],
	"schema": {
		"type": "any",
		"custom": "com.atlassian.jpo:jpo-custom-field-parent",
		"customId": 10200
	}
},
{
	"id": "customfield_10201",
	"name": "Target start",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10201]",
	"Target start"],
	"schema": {
		"type": "date",
		"custom": "com.atlassian.jpo:jpo-custom-field-baseline-start",
		"customId": 10201
	}
},
{
	"id": "customfield_10202",
	"name": "Target end",
	"custom": true,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["cf[10202]",
	"Target end"],
	"schema": {
		"type": "date",
		"custom": "com.atlassian.jpo:jpo-custom-field-baseline-end",
		"customId": 10202
	}
},
{
	"id": "environment",
	"name": "环境",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["environment"],
	"schema": {
		"type": "string",
		"system": "environment"
	}
},
{
	"id": "duedate",
	"name": "到期日",
	"custom": false,
	"orderable": true,
	"navigable": true,
	"searchable": true,
	"clauseNames": ["due",
	"duedate"],
	"schema": {
		"type": "date",
		"system": "duedate"
	}
},
{
	"id": "progress",
	"name": "进度",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["progress"],
	"schema": {
		"type": "progress",
		"system": "progress"
	}
},
{
	"id": "comment",
	"name": "备注",
	"custom": false,
	"orderable": true,
	"navigable": false,
	"searchable": true,
	"clauseNames": ["comment"],
	"schema": {
		"type": "comments-page",
		"system": "comment"
	}
},
{
	"id": "votes",
	"name": "表决",
	"custom": false,
	"orderable": false,
	"navigable": true,
	"searchable": false,
	"clauseNames": ["votes"],
	"schema": {
		"type": "votes",
		"system": "votes"
	}
},
{
	"id": "worklog",
	"name": "登记工作日志",
	"custom": false,
	"orderable": true,
	"navigable": false,
	"searchable": true,
	"clauseNames": [],
	"schema": {
		"type": "array",
		"items": "worklog",
		"system": "worklog"
	}
}]
```
- 列出Project
Response
```
[{
	"expand": "description,lead,url,projectKeys",
	"self": "http://de.vicp.net:6586/rest/api/2/project/10001",
	"id": "10001",
	"key": "FAMILY",
	"name": "family stuff",
	"avatarUrls": {
		"48x48": "http://de.vicp.net:6586/secure/projectavatar?avatarId=10324",
		"24x24": "http://de.vicp.net:6586/secure/projectavatar?size=small&avatarId=10324",
		"16x16": "http://de.vicp.net:6586/secure/projectavatar?size=xsmall&avatarId=10324",
		"32x32": "http://de.vicp.net:6586/secure/projectavatar?size=medium&avatarId=10324"
	},
	"projectTypeKey": "business",
	"archived": false
},
{
	"expand": "description,lead,url,projectKeys",
	"self": "http://de.vicp.net:6586/rest/api/2/project/10003",
	"id": "10003",
	"key": "MSAPP",
	"name": "microservice app",
	"avatarUrls": {
		"48x48": "http://de.vicp.net:6586/secure/projectavatar?avatarId=10324",
		"24x24": "http://de.vicp.net:6586/secure/projectavatar?size=small&avatarId=10324",
		"16x16": "http://de.vicp.net:6586/secure/projectavatar?size=xsmall&avatarId=10324",
		"32x32": "http://de.vicp.net:6586/secure/projectavatar?size=medium&avatarId=10324"
	},
	"projectTypeKey": "software",
	"archived": false
},
{
	"expand": "description,lead,url,projectKeys",
	"self": "http://de.vicp.net:6586/rest/api/2/project/10100",
	"id": "10100",
	"key": "SF",
	"name": "Solution Factory",
	"avatarUrls": {
		"48x48": "http://de.vicp.net:6586/secure/projectavatar?avatarId=10324",
		"24x24": "http://de.vicp.net:6586/secure/projectavatar?size=small&avatarId=10324",
		"16x16": "http://de.vicp.net:6586/secure/projectavatar?size=xsmall&avatarId=10324",
		"32x32": "http://de.vicp.net:6586/secure/projectavatar?size=medium&avatarId=10324"
	},
	"projectTypeKey": "software",
	"archived": false
},
{
	"expand": "description,lead,url,projectKeys",
	"self": "http://de.vicp.net:6586/rest/api/2/project/10002",
	"id": "10002",
	"key": "STDUIOEV",
	"name": "stduio-evolution",
	"avatarUrls": {
		"48x48": "http://de.vicp.net:6586/secure/projectavatar?avatarId=10324",
		"24x24": "http://de.vicp.net:6586/secure/projectavatar?size=small&avatarId=10324",
		"16x16": "http://de.vicp.net:6586/secure/projectavatar?size=xsmall&avatarId=10324",
		"32x32": "http://de.vicp.net:6586/secure/projectavatar?size=medium&avatarId=10324"
	},
	"projectTypeKey": "business",
	"archived": false
},
{
	"expand": "description,lead,url,projectKeys",
	"self": "http://de.vicp.net:6586/rest/api/2/project/10000",
	"id": "10000",
	"key": "TASKM",
	"name": "task manager",
	"avatarUrls": {
		"48x48": "http://de.vicp.net:6586/secure/projectavatar?avatarId=10324",
		"24x24": "http://de.vicp.net:6586/secure/projectavatar?size=small&avatarId=10324",
		"16x16": "http://de.vicp.net:6586/secure/projectavatar?size=xsmall&avatarId=10324",
		"32x32": "http://de.vicp.net:6586/secure/projectavatar?size=medium&avatarId=10324"
	},
	"projectTypeKey": "software",
	"archived": false
},
{
	"expand": "description,lead,url,projectKeys",
	"self": "http://de.vicp.net:6586/rest/api/2/project/10400",
	"id": "10400",
	"key": "LN",
	"name": "学习",
	"avatarUrls": {
		"48x48": "http://de.vicp.net:6586/secure/projectavatar?avatarId=10324",
		"24x24": "http://de.vicp.net:6586/secure/projectavatar?size=small&avatarId=10324",
		"16x16": "http://de.vicp.net:6586/secure/projectavatar?size=xsmall&avatarId=10324",
		"32x32": "http://de.vicp.net:6586/secure/projectavatar?size=medium&avatarId=10324"
	},
	"projectTypeKey": "business",
	"archived": false
},
{
	"expand": "description,lead,url,projectKeys",
	"self": "http://de.vicp.net:6586/rest/api/2/project/10300",
	"id": "10300",
	"key": "KS",
	"name": "知识库",
	"avatarUrls": {
		"48x48": "http://de.vicp.net:6586/secure/projectavatar?avatarId=10324",
		"24x24": "http://de.vicp.net:6586/secure/projectavatar?size=small&avatarId=10324",
		"16x16": "http://de.vicp.net:6586/secure/projectavatar?size=xsmall&avatarId=10324",
		"32x32": "http://de.vicp.net:6586/secure/projectavatar?size=medium&avatarId=10324"
	},
	"projectTypeKey": "business",
	"archived": false
}]
```