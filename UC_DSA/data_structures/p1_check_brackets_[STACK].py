# Author	: 		Ashish M [ShonenAsh]
# Problem	:		1 of Course-1 Week-1 from UC San Diego
# Description:		Check whether the brackets in a text are closed or not
# Input 	:		A text containing alphanumeric characters, brackets and common separators
# Output	:		Prints the column number of the unmatched bracket otherwise "Sucess"

class Item:
    def __init__(self, value):
        self.value = value
        self.next = None


class Stack:
    def __init__(self):
        self.start = None

    def push(self, value):
        x = Item(value)
        if self.start is None:
            self.start = x
        else:
            x.next = self.start
            self.start = x
        del x

    def pop(self):
        if self.start is None:
            # print("Stack Underflow!")
            return None
        else:
            x = self.start
            val = x.value
            self.start = self.start.next
            del x
            return val

    def peek(self):
        if self.start is None:
            # print("Stack is Empty!")
            return None
        else:
            return self.start.value


def are_matching(left, right):
    return (left + right) in ["[]", "{}", "()"]


def main():
    st = Stack()
    str = input()
    last_brk = [-1, None]

    for i, c in enumerate(str):
        if c in "[{(":
            last_brk = list([i, c])
            st.push(list([i, c]))
        elif c in "]})":
            popped = st.pop()
            if popped is None:
                print(i + 1)
                return
            if not are_matching(popped[1], c):
                print(i + 1)
                return
            else:
                if st.peek() is not None:
                    last_brk = st.peek()
                else:
                    last_brk = [-1, None]

    if last_brk[0] != -1 and st.start is not None:
        print(last_brk[0] + 1)
    else:
        print("Success")


if __name__ == '__main__':
    main()
