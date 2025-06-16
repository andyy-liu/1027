class AccessLevels:
    def __init__(self):
        self.a = 10

    def getValueOfa(self):
        return self.a
    

acc = AccessLevels()
print(acc.getValueOfa())