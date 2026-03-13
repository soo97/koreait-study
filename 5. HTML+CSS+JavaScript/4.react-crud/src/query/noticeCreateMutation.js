import { useMutation } from "@tanstack/react-query"


export const usenoticeCreateMutation = () =>{
    return useMutation({
                mutationFn: createApi,

    })
}

