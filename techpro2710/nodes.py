class Node:
    def __init__(self,data):
        self.data = data
        self.next

class LinkedList:
    def __init__(self):
        self.head = None

    def addElement(self,data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def removeHead(self):
        self.head = self.head.next

def length(self):
    counter = 1
    current = self.head
    if current == None:
        return 0
    
    while current.next != None:
        current = current.next
        counter = counter + 1

def printEverything(self):
    current = self.head
    if current is None:
        return
    while current.next != None:
        print(current.data)
        current = current.next


my_linked_list.addElement("George")
my_linked_list.addElement("Afroxilanthi")

print(my_linked_list.length())