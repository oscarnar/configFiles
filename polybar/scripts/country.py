import requests
import json

url = requests.get("http://freegeoip.net/json/")
#url = requests.get("http://api.hostip.info/get_json.php")
info = json.loads(url.text)
print(info["country_code"])
