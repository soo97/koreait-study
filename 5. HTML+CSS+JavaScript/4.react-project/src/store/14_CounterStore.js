import { create } from "zustand";

const useCounterStore = create((set) =>({
    count : 0,
    increase : () => set((state) => ({count : state.count+1}))
    // count 기본값 0, 1증가 시키는 함수
}))

export default useCounterStore;