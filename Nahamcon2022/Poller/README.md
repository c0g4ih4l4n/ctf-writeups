## Poller
> Have your say! Poller is the place where all the important infosec questions are asked.

Application is vote system, use cookie to authenticate, allow user sign up. source code `https://github.com/congon4tor/poller`
Secret key in commit data: 
`SECRET_KEY=77m6p#v&(wk_s2+n5na-bqe!m)^zu)9typ#0c&@qd%8o6!`
Application use `Django` with `PickleSerializer` have vulnerable to Deserialization. 
Use `Python3` to generate payload: `python3 exp.py`
Pass it to cookie to get Reverse shell to my vps and cat flag: ![Alt text](flag.png?raw=true "Title")