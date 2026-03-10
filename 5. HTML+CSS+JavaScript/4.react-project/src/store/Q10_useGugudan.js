import { create } from "zustand";


const useGugudan = create ((set)=>({
    msg1 : '',
    msg2 : '',
    number1 : (number1) => set(({msg1:number1})),
    number2 : (number2) => set(({msg2:number2})),
    msg3 : '',
    number3 : (number3) => set(({msg3:number3})),
    mult : (chan) => {
        if(msg3 == number1*number2){
            ischan:true;
        }else{
            ischan:false;
        }
    },
    clearmsg : () => set({number3:''})

}))

export default useGugudan;