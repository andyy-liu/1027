class Coordinate:

    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, other):
        new_x = self.x + other.x
        new_y = self.y + other.y
        return Coordinate(new_x, new_y)

    def __subtract__(self, other):
        new_x = self.x - other.x
        new_y = self.y - other.y
        return Coordinate(new_x, new_y)
    
    def __lt__(self, other):
        if self.x == other.x:
            return self.y < other.y
        return self.x < other.x

    def __repr__(self):
        return  '(' + str(self.x) + ', ' + str(self.y) + ')'

class CoordinatePlane:

    def __init__(self, coordinates = None):
        if coordinates == None:
            coordinates = []
        self.coordinates = coordinates

    def addCoordinate(self, coordinate):
        self.coordinates.append(coordinate)

    def printAllCoordinates(self):
        self.coordinates.sort()
        for coord in self.coordinates:
            print(coord)

p1 = Coordinate(2, 3)
p2 = Coordinate(3, 4)

p3 = p1 + p2

coordPlane = CoordinatePlane([p1, p2, p3])
coordPlane.printAllCoordinates()