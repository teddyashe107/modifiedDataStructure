class Queue {
  constructor(value) {
    this.value = [];
    this.size = 0;
    this.bootom = 0;
  }
  isEmpty() {
    return this.size === 0;
  }

  enqueue(data) {
    this.value[this.size] = data;
    this.size++;
  }
  dequeue() {
    let result = this.value[this.bootom];
    this.value[this.bootom] = null;
    this.size--;
    return result;

  }
  peek() {
    return this.value[this.bootom];
  }
  print() {
    for (let i = 0; i <= this.size; i++) {
      console.log(this.value[i]);
    }
  }

}

let qq = new Queue();
qq.enqueue(1);
qq.enqueue(2);
qq.enqueue(3);
qq.enqueue(4);
qq.enqueue(5);
qq.enqueue(6);

qq.print();
console.log("after dequeue opperation");
qq.dequeue();
qq.print();
