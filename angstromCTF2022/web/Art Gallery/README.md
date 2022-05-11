## Art Gallery
> bosh left his image gallery service running.... quick, git all of his secrets before he deletes them!!!

Application have LFI vulnerable.
Use that we can crawl `.git` folder in web root

This git folder have some error so we cannot use tool extractor to get objects from server. We have to do it mannual. 
The git system is construct by node and have structure like tree. The `.git/index` have current stage of modifying. And git keep track about history is just another object. The object is save in folder (objects/2bytes/38bytes) of hashes. 
We can use `zpipe` to read objects file.
After view `index` and we see no flag. We can traverse back to get previous `index` file and see flag.  (Read index by tool `gin`)
Get objects through LFI, -> get log file -> get old index, get flag hash finally get flag file.
Flag: `actf{lfi_me_alone_and_git_out_341n4kaf5u59v}`