document-download-log-hook
==========================

Its a common requirement where we want to track document download activities. 
This can be done with any third party analytic tool as well but some times we can use Liferay persisted data itself to track downloads.


Document download tracker can used as alternative to any analytic tool. It can be integrated with document library  to track document downloads.
Once you enable this app it will automatically persist all the information about who downloaded document. App will store information like User name and Remote IP address . 
This app has functionality clear logs for any document. 
User can also clear download logs for all document if they wish.


There few steps you need to follow to use this application.

1) Stop application server. Download document-download-tracking-hook-service jar from bundle and place this service jar to [SERVER]/lib/ext .
Set below property in portal-ext file.

 #
    # This property is used to enable/disable document download tracker app.
    # 
   document.download.logs.enabled=true
   

2) Once you are done with first step next thing is to restart your server. 
3) You can view download logs from Control Panel--> Document Library . Select any document and click on Download Logs action.
4) You can clear logs for individual document as well for all documents.
