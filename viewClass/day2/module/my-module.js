function cube(x) {
  return x * x;
}

function hello(str) {
  return "hello" + str;
}

let user = {
  num: 123,
  name: "박지현",
  address: "회기",
}

const foo = Math.PI * 2;
export {cube, hello, user, foo};

// anonymous export-1번만 허용됨
export default function dawoon() {
    id: 'ssafy';
    name: '이다운';
};
