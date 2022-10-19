import os
import discord
from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('"MzMzNjAwOTE5MzUyNjM5NDg5.GNaqkp.BlCA9Gwmo8gM8cdRtGXJSwWqdBcveUlytaSpTU"')
client = discord.Client(intents=discord.Intents.default())

@client.event
async def on_ready():
    print(f'{client.user} has connected to Discord!')

client.run(TOKEN)