

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