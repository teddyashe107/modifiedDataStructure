class Stack {
  constructor(value) {
    this.value = [];
    this.size = 0;
  }
  isEmpty() {
    return this.size === 0;
  }

  push(data) {
    this.value[this.size] = data;
    this.size++;
  }
  pop() {
    let result = this.value[this.size - 1];
    this.value[this.size - 1] = null;
    this.size--;
    return result;
  }
  peek() {
    return this.value[this.size - 1];
  }
  print() {
    for (let i = 0; i <= this.size; i++) {
      console.log(this.value[i]);
    }
  }

}

let ss = new Stack();
ss.push(1);
ss.push(2);
ss.push(3);
ss.push(4);
ss.push(5);
ss.push(6);
ss.push(7);
ss.push(8);
ss.print();
ss.pop();
ss.print();
