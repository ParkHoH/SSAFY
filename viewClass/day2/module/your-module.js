import { cube, foo, user, hello as hi} from "./my-module.js";

console.log(cube(3));
console.log(hi('gogo'));
console.log(foo);
console.log(user.num, user.name, user.address);

//default import
import dawoon from './my-module.js';
console.log(dawoon.id, dawoon.name);