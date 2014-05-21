document-download-log-hook
==========================

Its a common requirement where we want to track document download activities. 
This can be done with any third party analytic tool as well but some times we can use Liferay persisted data itself to track downloads.


Document download tracker can used as alternative to any analytic tool. It can be integrated with document library  to track document downloads.
Once you enable this app it will automatically persist all the information about who downloaded document. App will store information like User name and Remote IP address . 
This app has functionality clear logs for any document. 
User can also clear download logs for all document if they wish.


There few steps you need to follow to use this application. Here are deployment steps.

<b>Deployment steps for tomcat</b>

1) Stop application server.
Download document-download-tracking-hook-service jar from bundle and place this service jar to [SERVER]/lib/ext .
Set below property in portal-ext file.

 
   # # This property is used to enable/disable document download tracker app.
   

   <b>document.download.logs.enabled=true</b>
   

2) Place document-download-tracking-hook war in [Server]/deploy directory

3) Once you are done with above steps next thing is to restart your server. 


<b>Deployment steps for JBoss (7.1)</b>

1) Stop application server.
Download document-download-tracking-hook-service jar from bundle and place this service jar to  [server]/modules/com/liferay/portal/main folder .


2) Navigate to [server]/modules/com/liferay/portal/main folder and add below entry in module.xml.
<resource-root path="document-download-tracking-hook-service.jar" />


3) Set below property in portal-ext file.

 
   # # This property is used to enable/disable document download tracker app.
   

   <b>document.download.logs.enabled=true</b>
   

4) Place document-download-tracking-hook war in [Server]/deploy directory

5) Once you are done with above steps next thing is to restart your server. 



<b>How to use this application</p>

1) If the logs are enabled and if you download any document then it will be displayed in log .

2) If any logges in user downloads document then it will dispplay name of the user along with IP Adress and time of download.

3) If any non-authenticated user download document in that case it will stored on the name of Guest.

4) You can view download logs from Control Panel--> Document Library . Select any document and click on Download Logs action.

5) You can clear logs for individual document as well for all documents.
