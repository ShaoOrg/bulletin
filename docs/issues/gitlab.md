# Gitlab 
![400px,1000px](../assets/mindmap/gitlab_ci_cd.km)
###### GitLab Runners
-[官方文档](https://docs.gitlab.com/ee/ci/runners/runners_scope.html)
- [instance runner](https://de.vicp.net:58443/admin/runners)
- [runner缺省的shell类型](https://docs.gitlab.com/ee/ci/variables/#using-the-ci-variables-in-your-job-scripts), 定义在config.toml
- [runner supportted shell](https://docs.gitlab.com/runner/shells/index.html#shell-profile-loading)

###### Gitlab Pages
- [官方文档](https://docs.gitlab.com/ee/administration/pages/)
- 同域 ![400px,1000px](../assets/mindmap/gitlab-pages.km)

###### New Repository
- Create a new repository
```
git clone git@de.vicp.net:SszOrg/ci-cd-demo.git
cd ci-cd-demo
git switch --create main
touch README.md
git add README.md
git commit -m "add README"
git push --set-upstream origin main
```
- Push an existing folder
```
cd existing_folder
git init --initial-branch=main
git remote add origin git@de.vicp.net:SszOrg/ci-cd-demo.git
git add .
git commit -m "Initial commit"
git push --set-upstream origin main
```
- Push an existing Git repository
```
cd existing_repo
git remote rename origin old-origin
git remote add origin git@de.vicp.net:SszOrg/ci-cd-demo.git
git push --set-upstream origin --all
git push --set-upstream origin --tags
```
###### Variable
- [企业级](https://de.vicp.net:58443/admin/application_settings/ci_cd)
- [组织级](https://de.vicp.net:58443/groups/SszOrg/-/settings/ci_cd)
- [仓库级](https://de.vicp.net:58443/SszOrg/ci-cd-demo/-/settings/ci_cd)
- CI级,定义在ci/cd文件的variables里
- branch触发的env
```
SHELL=/bin/bash
CI_PROJECT_NAMESPACE=nsb
GITLAB_USER_ID=3
ASSETS_FOLDER=nsb/bulletin/main/docs/assets
CI_RUNNER_VERSION=17.5.1
FF_SKIP_NOOP_BUILD_STAGES=true
DEPLOY_ENV=staging
FF_USE_INIT_WITH_DOCKER_EXECUTOR=false
CI_SERVER_NAME=GitLab
CI_RUNNER_DESCRIPTION=default instance runner
GITLAB_USER_EMAIL=ssz@de.vicp.net
NVM_INC=/etc/skel/.nvm/versions/node/v20.18.0/include/node
CI_SERVER_REVISION=e4e13234b2d
FF_USE_WINDOWS_LEGACY_PROCESS_STRATEGY=false
CI_RUNNER_EXECUTABLE_ARCH=linux/amd64
CI_PIPELINE_NAME=
CI_REGISTRY_USER=gitlab-ci-token
CI_API_V4_URL=https://de.vicp.net:58443/api/v4
CI_REGISTRY_PASSWORD=[MASKED]
CI_RUNNER_SHORT_TOKEN=24zEdb-7A
CI_JOB_NAME=pages
GITLAB_USER_LOGIN=ssz
CI_PROJECT_NAME=bulletin
CI_PIPELINE_SOURCE=push
GITLAB_INSTANCE_VAR=demo variable value of instance level
FF_RETRIEVE_POD_WARNING_EVENTS=true
JAVA_HOME=/usr/java/jdk-17
CI_JOB_STATUS=running
CI_PIPELINE_ID=1399
GRADLE_HOME=/usr/share/gradle
FF_DISABLE_POWERSHELL_STDIN=false
CI_COMMIT_REF_SLUG=main
CI_SERVER=yes
FF_SET_PERMISSIONS_BEFORE_CLEANUP=true
NPMJS_TEMPESTWIN_PERSON_ACCESS_TOKEN=[MASKED]
CI_COMMIT_SHORT_SHA=cfaf7101
CONFIG_FILE=/etc/gitlab-runner/config.toml
CI_JOB_NAME_SLUG=pages
RUNNER_TEMP_PROJECT_DIR=/home/gitlab-runner/builds/24zEdb-7A/0/nsb/bulletin.tmp
CI_DEPENDENCY_PROXY_GROUP_IMAGE_PREFIX=de.vicp.net:58443/nsb/dependency_proxy/containers
FF_USE_GIT_BUNDLE_URIS=true
PWD=/home/gitlab-runner/builds/24zEdb-7A/0/nsb/bulletin
CI_RUNNER_TAGS=["X64", "Self-managed", "Linux", "unbuntu", "ubuntu-latest"]
CI_PROJECT_PATH=nsb/bulletin
LOGNAME=gitlab-runner
FF_TIMESTAMPS=false
XDG_SESSION_TYPE=unspecified
FF_USE_NEW_BASH_EVAL_STRATEGY=false
CI_DEPENDENCY_PROXY_DIRECT_GROUP_IMAGE_PREFIX=de.vicp.net:58443/nsb/dependency_proxy/containers
CI_SERVER_TLS_CA_FILE=/home/gitlab-runner/builds/24zEdb-7A/0/nsb/bulletin.tmp/CI_SERVER_TLS_CA_FILE
SYSTEMD_EXEC_PID=620
FF_USE_LEGACY_S3_CACHE_ADAPTER=false
FF_DISABLE_UMASK_FOR_KUBERNETES_EXECUTOR=false
CI_COMMIT_REF_PROTECTED=true
FF_USE_POWERSHELL_PATH_RESOLVER=false
FF_USE_DOCKER_AUTOSCALER_DIAL_STDIO=true
CI_API_GRAPHQL_URL=https://de.vicp.net:58443/api/graphql
CI_SERVER_VERSION_MINOR=5
CI_COMMIT_SHA=cfaf7101b54081073f06f9c4f90e6ea330fc911c
HOME=/home/gitlab-runner
FF_NETWORK_PER_BUILD=false
LANG=C.UTF-8
CI_DEPENDENCY_PROXY_PASSWORD=[MASKED]
CI_JOB_TIMEOUT=3600
CI_PROJECT_VISIBILITY=internal
CI_CONCURRENT_PROJECT_ID=0
FF_SCRIPT_SECTIONS=false
CI_COMMIT_MESSAGE=NOCR: gradle project
FF_USE_WINDOWS_JOB_OBJECT=false
CI_SERVER_SHELL_SSH_PORT=22
FF_DISABLE_AUTOMATIC_TOKEN_ROTATION=false
FF_USE_DIRECT_DOWNLOAD=true
CI_PAGES_DOMAIN=de.vicp.net
FF_PRINT_POD_EVENTS=false
CI_SERVER_VERSION=17.5.1-ee
FF_USE_POD_ACTIVE_DEADLINE_SECONDS=true
CI_REGISTRY=de.vicp.net:5050
CI_SERVER_PORT=58443
CI_PROJECT_NAMESPACE_ID=673
CI_SHARED_ENVIRONMENT=true
FF_TEST_FEATURE=false
INVOCATION_ID=b255dc90e9204d3596b0d78b557afb6d
CI_PAGES_URL=https://de.vicp.net:48443/nsb/bulletin
CI_PIPELINE_IID=13
CI_REPOSITORY_URL=https://gitlab-ci-token:[MASKED]@de.vicp.net:58443/nsb/bulletin.git
CI_SERVER_URL=https://de.vicp.net:58443
FF_ENABLE_BASH_EXIT_CODE_CHECK=false
GITLAB_FEATURES=audit_events,blocked_issues,board_iteration_lists,code_owners,code_review_analytics,full_codequality_report,group_activity_analytics,group_bulk_edit,issuable_default_templates,issue_weights,iterations,ldap_group_sync,merge_request_approvers,milestone_charts,multiple_issue_assignees,multiple_ldap_servers,multiple_merge_request_assignees,multiple_merge_request_reviewers,project_merge_request_analytics,protected_refs_for_users,push_rules,resource_access_token,seat_link,seat_usage_quotas,pipelines_usage_quotas,transfer_usage_quotas,product_analytics_usage_quotas,wip_limits,zoekt_code_search,blocked_work_items,description_diffs,send_emails_from_admin_area,repository_size_limit,maintenance_mode,scoped_issue_board,contribution_analytics,group_webhooks,member_lock,elastic_search,repository_mirrors,ai_chat,adjourned_deletion_for_projects_and_groups,admin_audit_log,auditor_user,blocking_merge_requests,board_assignee_lists,board_milestone_lists,ci_secrets_management,ci_pipeline_cancellation_restrictions,cluster_agents_ci_impersonation,cluster_agents_user_impersonation,cluster_deployments,code_owner_approval_required,code_suggestions,commit_committer_check,commit_committer_name_check,compliance_framework,custom_compliance_frameworks,custom_fields,custom_file_templates,custom_project_templates,cycle_analytics_for_groups,cycle_analytics_for_projects,db_load_balancing,default_branch_protection_restriction_in_groups,default_project_deletion_protection,delete_unconfirmed_users,dependency_proxy_for_packages,disable_extensions_marketplace_for_enterprise_users,disable_name_update_for_users,disable_personal_access_tokens,domain_verification,epics,extended_audit_events,external_authorization_service_api_management,feature_flags_code_references,file_locks,geo,generic_alert_fingerprinting,git_two_factor_enforcement,group_allowed_email_domains,group_coverage_reports,group_forking_protection,group_level_compliance_dashboard,group_milestone_project_releases,group_project_templates,group_repository_analytics,group_saml,group_scoped_ci_variables,ide_schema_config,incident_metric_upload,instance_level_scim,jira_issues_integration,ldap_group_sync_filter,merge_request_performance_metrics,admin_merge_request_approvers_rules,merge_trains,metrics_reports,multiple_alert_http_integrations,multiple_approval_rules,multiple_group_issue_boards,object_storage,microsoft_group_sync,operations_dashboard,package_forwarding,pages_size_limit,pages_multiple_versions,productivity_analytics,project_aliases,protected_environments,reject_non_dco_commits,reject_unsigned_commits,remote_development,saml_group_sync,service_accounts,scoped_labels,smartcard_auth,ssh_certificates,swimlanes,target_branch_rules,type_of_work_analytics,minimal_access_role,unprotection_restrictions,ci_project_subscriptions,incident_timeline_view,oncall_schedules,escalation_policies,zentao_issues_integration,coverage_check_approval_rule,issuable_resource_links,group_protected_branches,group_level_merge_checks_setting,oidc_client_groups_claim,disable_deleting_account_for_users,disable_private_profiles,group_saved_replies,requested_changes_block_merge_request,project_saved_replies,default_roles_assignees,group_ip_restriction,issues_analytics,password_complexity,group_wikis,email_additional_text,custom_file_templates_for_namespace,incident_sla,export_user_permissions,cross_project_pipelines,feature_flags_related_issues,merge_pipelines,ci_cd_projects,github_integration,ai_config_chat,ai_features,ai_workflows,glab_ask_git_command,ai_agents,ai_review_mr,api_discovery,api_fuzzing,auto_rollback,breach_and_attack_simulation,cluster_receptive_agents,cluster_image_scanning,external_status_checks,combined_project_analytics_dashboards,compliance_pipeline_configuration,container_scanning,credentials_inventory,custom_roles,dast,dependency_scanning,dora4_analytics,epic_colors,enterprise_templates,environment_alerts,evaluate_group_level_compliance_pipeline,explain_code,external_audit_events,experimental_features,generate_description,generate_commit_message,generate_test_file,ai_generate_cube_query,git_abuse_rate_limit,group_ci_cd_analytics,group_level_compliance_adherence_report,group_level_compliance_violations_report,project_level_compliance_dashboard,project_level_compliance_adherence_report,project_level_compliance_violations_report,group_level_analytics_dashboard,incident_management,inline_codequality,insights,issuable_health_status,issues_completed_analytics,jira_vulnerabilities_integration,jira_issue_association_enforcement,kubernetes_cluster_vulnerabilities,license_scanning,okrs,personal_access_token_expiration_policy,pre_receive_secret_detection,product_analytics,project_quality_summary,project_level_analytics_dashboard,quality_management,related_epics,release_evidence_test_artifacts,report_approver_rules,required_ci_templates,requirements,runner_maintenance_note,runner_performance_insights,runner_performance_insights_for_namespace,runner_upgrade_management,runner_upgrade_management_for_namespace,sast,sast_advanced,sast_iac,sast_custom_rulesets,sast_fp_reduction,secret_detection,security_configuration_in_ui,security_dashboard,security_on_demand_scans,security_orchestration_policies,security_training,ssh_key_expiration_policy,summarize_mr_changes,summarize_my_mr_code_review,summarize_new_merge_request,summarize_comments,stale_runner_cleanup_for_namespace,status_page,suggested_reviewers,subepics,observability,troubleshoot_job,unique_project_download_limit,vulnerability_finding_signatures,container_scanning_for_registry,security_exclusions,security_scans_api,coverage_fuzzing,devops_adoption,group_level_devops_adoption,instance_level_devops_adoption
CI_COMMIT_DESCRIPTION=
FF_USE_ADVANCED_POD_SPEC_CONFIGURATION=false
CI_TEMPLATE_REGISTRY_HOST=registry.gitlab.com
CI_JOB_STAGE=deploy
NVM_DIR=/etc/skel/.nvm
CI_PIPELINE_URL=https://de.vicp.net:58443/nsb/bulletin/-/pipelines/1399
CI_DEFAULT_BRANCH=main
FF_GIT_URLS_WITHOUT_TOKENS=false
XDG_SESSION_CLASS=background
GITLAB_ENV=/home/gitlab-runner/builds/24zEdb-7A/0/nsb/bulletin.tmp/gitlab_runner_env
CI_SERVER_VERSION_PATCH=1
CI_COMMIT_TITLE=NOCR: gradle project
USER=gitlab-runner
CI_SERVER_FQDN=de.vicp.net:58443
CI_PROJECT_ROOT_NAMESPACE=nsb
FF_ENABLE_JOB_CLEANUP=false
RUNNER_ALLOW_RUNASROOT=1
FF_RESOLVE_FULL_TLS_CHAIN=false
GITLAB_USER_NAME=ssz
CI_PROJECT_DIR=/home/gitlab-runner/builds/24zEdb-7A/0/nsb/bulletin
SHLVL=1
NVM_CD_FLAGS=
CI_RUNNER_ID=2
CI_PIPELINE_CREATED_AT=2024-11-21T14:00:05Z
CI_COMMIT_TIMESTAMP=2024-11-21T21:59:52+08:00
CI_SERVER_SHELL_SSH_HOST=de.vicp.net
CI_REGISTRY_IMAGE=de.vicp.net:5050/nsb/bulletin
DRAWIO_EDITOR_URL=https://de.vicp.net:25053
CI_SERVER_PROTOCOL=https
XDG_SESSION_ID=c2591
CI_COMMIT_AUTHOR=tempestwin <tempestwin@163.com>
FF_POSIXLY_CORRECT_ESCAPES=false
CI_COMMIT_REF_NAME=main
CI_SERVER_HOST=de.vicp.net
FF_USE_DUMB_INIT_WITH_KUBERNETES_EXECUTOR=false
CI_JOB_URL=https://de.vicp.net:58443/nsb/bulletin/-/jobs/8362
CI_JOB_TOKEN=[MASKED]
CI_JOB_STARTED_AT=2024-11-21T14:00:08Z
CI_CONCURRENT_ID=0
CI_PROJECT_DESCRIPTION=New Project
CI_COMMIT_BRANCH=main
CI_PROJECT_CLASSIFICATION_LABEL=
FF_USE_LEGACY_KUBERNETES_EXECUTION_STRATEGY=false
XDG_RUNTIME_DIR=/run/user/998
CI_RUNNER_REVISION=affd9e7d
FF_KUBERNETES_HONOR_ENTRYPOINT=false
FF_CLEAN_UP_FAILED_CACHE_EXTRACT=false
CI_DEPENDENCY_PROXY_USER=gitlab-ci-token
FF_USE_DYNAMIC_TRACE_FORCE_SEND_INTERVAL=false
FF_DISABLE_UMASK_FOR_DOCKER_EXECUTOR=false
CI_PROJECT_PATH_SLUG=nsb-bulletin
CI_NODE_TOTAL=1
CI_JOB_ID=8362
CI_BUILDS_DIR=/home/gitlab-runner/builds
CI_PROJECT_REPOSITORY_LANGUAGES=shell
JOURNAL_STREAM=8:18863
XDG_DATA_DIRS=/usr/local/share:/usr/share:/var/lib/snapd/desktop
FF_LOG_IMAGES_CONFIGURED_FOR_JOB=false
PATH=/usr/java/jdk-17/bin:/etc/skel/.nvm/versions/node/v20.18.0/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin
KITY_MINDER_EDITOR_URL=https://de.vicp.net:25053
CI_PROJECT_ID=396
FF_SECRET_RESOLVING_FAILS_IF_MISSING=true
CI=true
GITLAB_CI=true
DBUS_SESSION_BUS_ADDRESS=unix:path=/run/user/998/bus
CI_COMMIT_BEFORE_SHA=7e4cfa36344440a23c64ccf2c2f8a70e3962da0b
CI_PROJECT_TITLE=bulletin
CI_SERVER_VERSION_MAJOR=17
NVM_BIN=/etc/skel/.nvm/versions/node/v20.18.0/bin
MAIL=/var/mail/gitlab-runner
CI_CONFIG_PATH=.gitlab-ci.yml
FF_USE_LEGACY_GCS_CACHE_ADAPTER=false
FF_USE_FASTZIP=false
CI_DEPENDENCY_PROXY_SERVER=de.vicp.net:58443
CI_PROJECT_URL=https://de.vicp.net:58443/nsb/bulletin
OLDPWD=/home/gitlab-runner
_=/usr/bin/env
```
###### Release
- [通过API Release](https://docs.gitlab.com/ee/api/releases)
- [已有的Release增加Link]()
```
curl "https://de.vicp.net:58443/api/v4/projects/353/releases/v0.3.3/assets/links" --header 'Content-Type: application/json' --request POST --header "PRIVATE-TOKEN: person-access-token" \
--data @- <<EOF
{
  "name": "hello-public.sh",
  "link_type": "other",
  "url": "https://de.vicp.net:9000/gitlab.package/demo/hello.sh?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=Q0WiPPNdHXSiFoCftsF2%2F20241023%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241023T001646Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=df3e54943dc375255e6ba4adc547ebd58b98858bc8027597cc4644ba5db902d0"
}
EOF
```
###### Job Rules
- if里不能用`${变量}`,只能用`$变量`,否则会报错
- [必须在repo的setting里设置protected tag(例如v*)](https://www.reddit.com/r/gitlab/comments/1ah7eq3/how_to_get_gitlabrunner_to_run_not_get_stuck_when/), 这样提交git push origin --tags(git push --follow-tags)时候,这个pipeline才不会stuck
