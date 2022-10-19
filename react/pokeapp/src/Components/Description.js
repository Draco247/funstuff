import React from 'react';


const Description = ({pokemon_height, pokemon_weight}) => {
    return (
        <div className="description">
            <p><b>Height</b> is <b>{pokemon_height*10} cm</b></p>
            <p><b>Weight</b> is <b>{pokemon_weight*0.1} kg</b></p>


        </div>

    )
}
