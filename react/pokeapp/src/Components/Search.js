import React from 'react';

const Search = ({searchQuery, setSearchQuery}) => (
    <form action="/" method="get">
        <label htmlFor="header-search">
            <span className="visually-hidden">Search Pokemon</span>
        </label>
        <input
            value={searchQuery}
            onInput={e => setSearchQuery(e.target.value)}
            type="text"
            id="header-search"
            placeholder="Search Pokemon"
            name="s"
        />
        <button type="submit">Search</button>
    </form>
)


export default Search;