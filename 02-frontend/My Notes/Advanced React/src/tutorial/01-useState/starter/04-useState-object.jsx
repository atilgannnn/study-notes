import { useState } from 'react';

const UseStateObject = () => {
  const [person, setPerson] = useState({
    name: 'peter',
    age: 24,
    hobby: 'reading books',
  });
  const [name, setName] = useState('peter');
  const [age, setAge] = useState(24);
  const [hobby, setHobby] = useState('read books');

  const displayPerson = () => {
    //setPerson({name:'john', age:28, hobby:'scream at the computer'});-> We can set person like this
    //setPerson('shakeAndBake');-> This returns nothing
    //setPerson({ name: 'susan' }); -> If I wanna change just one section, this code only changes name and doesn't bring the old value. Everything except the changed name vanishes.
    setPerson({...person,name:'susan'}); //-> This code changes the name but keeps the old values same and displays them on the monitor. Spread operator helps us to update the relevant section properly.
  };
  return (
    <>
      <h3>{person.name}</h3>
      <h3>{person.age}</h3>
      <h4>Enjoys : {person.hobby}</h4>
      <button className='btn' onClick={displayPerson}>
        show john
      </button>
    </>
  );
};

export default UseStateObject;
