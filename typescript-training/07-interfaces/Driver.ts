import { Coach } from './Coach';
import { GolfCoach } from './GolfCoach';
import { CricketCoach } from './CricketCoach';

let myCricketCoach = new CricketCoach();
let myGolfCoach = new GolfCoach();


let theCoaches: Coach[] = [];

theCoaches.push(myCricketCoach);
theCoaches.push(myGolfCoach);


for (let i of theCoaches) {
    console.log(i.getDailyWorkout());
}

