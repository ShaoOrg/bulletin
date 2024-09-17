# Jira

###### Rest API
- [v2](https://developer.atlassian.com/cloud/jira/platform/rest/v2/intro/#version)
- [Get comments](https://developer.atlassian.com/cloud/jira/platform/rest/v2/api-group-issue-comments/#api-rest-api-2-issue-issueidorkey-comment-get)
```bash
curl -s -L -X GET \
  --url 'https://de.vicp.net:6586/rest/api/2/issue/KS-184/comment' \
  -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" \
  --header 'Accept: application/json'
```
- [Get all projects](https://developer.atlassian.com/cloud/jira/platform/rest/v2/api-group-projects/#api-group-projects)
```bash
curl -s -L -X GET \
  --url 'https://de.vicp.net:6586/rest/api/latest/project' \
  -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" \
  -H 'Accept: application/json'
```
- issue type
```bash
curl -s -L -X GET -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" --url 'https://de.vicp.net:6586/rest/api/latest/issuetype'
```
- webhook
```bash
curl -s -L -X GET -H "Authorization: Bearer $(get_mask_password jira-admin-person-access-token)" --url 'https://de.vicp.net:6586/rest/api/2/webhook/failed'
```
