import math
import os
import sounddevice as gravador
import numpy as np
import sound


SAMPLE_RATE = 44100
DURACAO = 1
ARQUIVO_DE_AUDIO = ""

def gravar_audio():
    if os.path.exists(ARQUIVO_DE_AUDIO):
        os.remove(ARQUIVO_DE_AUDIO)
    #audio =  gravador.rec(int(DURACAO + SAMPLE_RATE), samplerate=SAMPLE_RATE), channels=2)
    gravador.wait()
    #write

def ler_audio():
    """"""

def get_amostra_de_audio():
    pass