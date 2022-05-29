1. all ./gradlew <task> that run will run on all  subprojects
2. if you need to run a task on specific project
   1. then use ./gradlew <subprojectPath> <task>
   2. but it will run the task on other projects which the subproject depends on
3. Convention Plugins:
   1. extract common build logic into reusable build script